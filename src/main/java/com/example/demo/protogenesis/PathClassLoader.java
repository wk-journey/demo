package com.example.demo.protogenesis;

import java.io.*;

/**
 * @author wangkai
 * @date 2018-08-09 17:18
 * @desc com.example.demo.protogenesis
 */
public class PathClassLoader extends ClassLoader {

	private String classPath;

	public PathClassLoader(String classPath) {
		this.classPath = classPath;
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		byte[] classData = getData(name);
		if (classData == null) {
			throw new ClassNotFoundException();
		}

		return defineClass(name, classData, 0, classData.length);
	}

	private byte[] getData(String className) {
		String path = classPath + File.separatorChar
				+ className.replace('.', File.separatorChar) + ".class";
		try {
			InputStream is = new FileInputStream(path);
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			byte[] buffer = new byte[2048];
			int num = 0;
			while ((num = is.read(buffer)) != -1) {
				stream.write(buffer, 0, num);
			}
			return stream.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		ClassLoader pc1 = new PathClassLoader("E:\\my\\idea\\springboot\\180322\\demo\\src\\main\\java\\com\\example\\demo\\entity");
		// 要包括包名
		Class c = pc1.loadClass("com.example.demo.protogenesis.TestClassLoader");
//		Class c = pc1.loadClass("com.example.demo.entity.User");
		// 打印类加载成功
		System.out.println(c.newInstance());
	}
}

class TestClassLoader {
	@Override
	public String toString() {
		return "Load success!";
	}
}
//package com.example.demo;
//
//import com.example.demo.controller.HelloController;
//import com.example.demo.controller.UserController;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.hamcrest.Matchers.equalTo;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class DemoApplicationTests {
//
//	private MockMvc mvc;
//
////	@Autowired
////	private BlogProperties blogProperties;
//
//	@Before
//	public void setUp() throws Exception {
////		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
//		mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
//	}
//
//	@Test
//	public void getHello() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
//		.andExpect(status().isOk())
//		.andExpect(content().string(equalTo("Hello World")));
//	}
//
//	@Test
//	public void getyProperties() throws Exception {
////		Integer intNumber = blogProperties.getIntNumber();
////		System.out.println(intNumber);
////		Assert.assertEquals(blogProperties.getName(), "haha");
////		// 中文会出现字符转换问题
////		Assert.assertEquals(blogProperties.getTitle(), "Spring Boot教程");
////		System.out.println(blogProperties.getDesc());
//	}
//
//	@Test
//	public void testHelloController() throws Exception {
//		RequestBuilder request = null;
//
//		// 1、get查一下user列表，应该为空
//		request = get("/users/");
//		mvc.perform(request)
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("[]")));
//
//		// 2、post提交一个user
//		request = post("/users/")
//				.param("id", "1")
//				.param("name", "测试")
//				.param("age", "20");
//		mvc.perform(request)
//				.andExpect(content().string(equalTo("success")));
//
//		// 3、get获取user列表，应该有刚才插入的数据
//		request = get("/users/");
//		mvc.perform(request)
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试\",\"age\":20}]")));
//
//		// 4、put修改id为1的user
//		request = put("/users/1")
//				.param("name", "终极测试")
//				.param("age", "25");
//		mvc.perform(request)
//				.andExpect(content().string(equalTo("success")));
//
////		// 5、get一个id为1的user
////		request = get("/users/1");
////		mvc.perform(request)
////				.andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"终极测试\",\"age\":25}]")));
////
////		// 6、del删除id为1的user
////		request = delete("/users/1");
////		mvc.perform(request)
////				.andExpect(content().string(equalTo("success")));
////
////		// 7、get查一下user列表，应该为空
////		request = get("/users/");
////		mvc.perform(request)
////				.andExpect(status().isOk())
////				.andExpect(content().string(equalTo("[]")));
//	}
//
//	@Test
//	public void contextLoads() {
//	}
//
//}

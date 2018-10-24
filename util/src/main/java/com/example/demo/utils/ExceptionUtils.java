package com.example.demo.utils;

/**
 * Created by wangkai on 2018/10/16.
 */
public class ExceptionUtils {

    public static void main(String[] args) {
        ExceptionUtils exceptionUtils = new ExceptionUtils();
        String r = exceptionUtils.testReturn();
        System.out.println(r);
    }


    public String testReturn() {
        String t = "try";
        String c = "catch";
        String f = "finally";
        try {
            System.out.println(t);
//            return t;
            throw new Exception();
        } catch (Exception e) {
            System.out.println(c);
//            throw new Exception();
            return c;
        } finally {
            System.out.println(f);
            return f;
        }
    }
}

package com.example.demo.utils.jdks;

public interface SonInterface extends DefaultInterface {
    String EXTENDS_MEMBER = "extends_member_son ";

    String PUBLIC_STATIC_MEMBER = "son_static_member ";

    default String testExtend(String s) {
        String h = "hello ";
        System.out.println(h + EXTENDS_MEMBER + s);
        return h + EXTENDS_MEMBER + s;
    }

    default String testDefaultMethodBySon(String s) {
        String h = "hello ";
        System.out.println(h + DEFAULT_FOR_SON + s);
        return h + DEFAULT_FOR_SON + s;
    }

    String testSon();
}

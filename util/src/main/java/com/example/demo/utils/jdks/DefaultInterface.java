package com.example.demo.utils.jdks;

public interface DefaultInterface {
    String EXTENDS_MEMBER = "extends_member_default ";

    String PUBLIC_STATIC_MEMBER = "public_static_member ";

    String DEFAULT_FOR_SON = "public_static_member ";

    default String testDefault(String s) {
        String h = "hello ";
        System.out.println(h + PUBLIC_STATIC_MEMBER + s);
        return h + PUBLIC_STATIC_MEMBER + s;
    }

    default String testExtend(String s) {
        String h = "hello ";
        System.out.println(h + EXTENDS_MEMBER + s);
        return h + EXTENDS_MEMBER + s;
    }

    default String testSonMethodByDefault(String s) {
        String h = "hello ";
        System.out.println(h + EXTENDS_MEMBER + s);
        return h + EXTENDS_MEMBER + s;
    }

    String test();
}

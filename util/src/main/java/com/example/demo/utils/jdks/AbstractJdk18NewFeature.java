package com.example.demo.utils.jdks;

public abstract class AbstractJdk18NewFeature implements SonInterface {
    private String private4Construct;

    public String getPrivate4Construct() {
        return private4Construct;
    }

    public void setPrivate4Construct(String private4Construct) {
        this.private4Construct = private4Construct;
    }

    public AbstractJdk18NewFeature() {

    }

    public AbstractJdk18NewFeature(String private4Construct) {
        this.private4Construct = private4Construct;
    }

    public abstract String testAbstractPublic(String s);
    protected abstract String testAbstractProtected(String s);

//    @Override
//    public String testExtend(String s) {
//        return null;
//    }

    @Override
    public String testDefault(String s) {
        return null;
    }

    @Override
    public String testSon() {
        return null;
    }
}

package com.example.demo.utils.jdks;

public class Jdk18NewFeatureUtils extends AbstractJdk18NewFeature {
    @Override
    public String test() {
        return null;
    }

    public Jdk18NewFeatureUtils() {
    }

    public Jdk18NewFeatureUtils(String private4Construct) {
        super(private4Construct);
    }

    @Override
    public String testAbstractPublic(String s) {
        return null;
    }

    @Override
    protected String testAbstractProtected(String s) {
        return null;
    }

    public static void main(String[] args) {
        Jdk18NewFeatureUtils utils = new Jdk18NewFeatureUtils();
        utils.testDefaultMethodBySon("first");
        utils.testDefault(" abc ");
        utils.testExtend(" abc ");
        utils.testSonMethodByDefault("");
    }
}

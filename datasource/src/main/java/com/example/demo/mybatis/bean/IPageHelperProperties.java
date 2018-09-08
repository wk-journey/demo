package com.example.demo.mybatis.bean;

import java.util.Properties;

/**
 * Created by wangkai on 2018/9/8.
 */
public interface IPageHelperProperties {
    Properties getProperties();

    String getOffSetAsPageNum();

    String getRowBoundsWithCount();

    String getPageSizeZero();

    String getReasonable();

    String getSupportMethodsArguments();

    String getDialect();

    String getHelperDialect();

    String getAutoRuntimeDialect();

    String getAutoDialect();

    String getCloseConn();

    String getParams();
}

package com.example.demo.mybatis.bean;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by wangkai on 2018/9/7.
 * 通用mapper接口，该接口不能被mybatis扫描到
 */
public interface IMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

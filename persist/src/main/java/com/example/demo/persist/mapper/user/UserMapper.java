package com.example.demo.persist.mapper.user;

import com.example.demo.mybatis.bean.IMapper;
import com.example.demo.persist.entity.user.UserEntity;

/**
 * @author wangkai
 * @date 2018-08-22 16:17
 * @desc com.example.demo.persist.mapper
 */
//@TargetDataSource(name = "slave")
public interface UserMapper extends IMapper<UserEntity> {

}

package com.chenzhe.learn.design.pattern.decorator.dao;

import com.chenzhe.learn.design.pattern.decorator.dto.DecoratorDTO;
import com.chenzhe.learn.design.pattern.decorator.entity.UserEntity;

import java.sql.SQLException;

/**
 * 用户信息相关dao
 * @author cz
 * @date 2020-08-23
 */
public interface UserInfoMapper {

    /**
     * 根据用户名密码查询用户信息
     * @param dto 参数
     * @return 用户信息
     * @throws SQLException 数据库异常
     */
    UserEntity getUserInfoByAccount(DecoratorDTO dto) throws SQLException;
}

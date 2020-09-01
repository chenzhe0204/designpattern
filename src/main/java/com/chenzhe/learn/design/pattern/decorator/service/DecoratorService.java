package com.chenzhe.learn.design.pattern.decorator.service;

import com.chenzhe.learn.design.pattern.decorator.dto.DecoratorDTO;
import com.chenzhe.learn.design.pattern.decorator.vo.UserInfoVO;

import java.sql.SQLException;

/**
 *装饰器模式service
 * @author cz
 * @date 2020-08-23
 */
public interface DecoratorService {

    /**
     * 根据账号密码查询用户信息
     * @param dto 参数
     * @return 用户信息
     * @throws SQLException 数据库异常
     */
    UserInfoVO getUserInfo(DecoratorDTO dto) throws SQLException;
}

package com.chenzhe.learn.design.pattern.decorator.service.impl;

import com.chenzhe.learn.design.pattern.decorator.dao.UserInfoMapper;
import com.chenzhe.learn.design.pattern.decorator.dto.DecoratorDTO;
import com.chenzhe.learn.design.pattern.decorator.entity.UserEntity;
import com.chenzhe.learn.design.pattern.decorator.service.DecoratorService;
import com.chenzhe.learn.design.pattern.decorator.vo.UserInfoVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 *装饰器模式service
 * @author cz
 * @date 2020-08-23
 */
@Service
@RequiredArgsConstructor(onConstructor_={@Autowired})
public class DecoratorServiceImpl implements DecoratorService {

    private final UserInfoMapper userInfoMapper;
    /**
     * 根据账号密码查询用户信息
     * @param dto 参数
     * @return 用户信息
     * @throws SQLException 数据库异常
     */
    @Override
    public UserInfoVO getUserInfo(DecoratorDTO dto) throws SQLException {
        UserInfoVO userInfoVO = new UserInfoVO();
        UserEntity userEntity = userInfoMapper.getUserInfoByAccount(dto);
        BeanUtils.copyProperties(userEntity,userInfoVO);
        return userInfoVO;
    }

}

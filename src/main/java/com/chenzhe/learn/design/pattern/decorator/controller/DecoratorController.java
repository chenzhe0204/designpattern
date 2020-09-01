package com.chenzhe.learn.design.pattern.decorator.controller;

import com.chenzhe.learn.design.pattern.decorator.dto.DecoratorDTO;
import com.chenzhe.learn.design.pattern.decorator.entity.UserEntity;
import com.chenzhe.learn.design.pattern.decorator.group.SelectInfo;
import com.chenzhe.learn.design.pattern.decorator.service.DecoratorService;
import com.chenzhe.learn.design.pattern.decorator.vo.UserInfoVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 *装饰器模式controller
 * @author cz
 * @date 2020-08-23
 */
@RestController
@Slf4j
@RequestMapping("/decorator")
@RequiredArgsConstructor(onConstructor_={@Autowired})
public class DecoratorController {

    private final DecoratorService decoratorService;
    /**
     * 根据账号密码查询用户信息
     * @param dto 参数
     * @return 用户信息
     * @throws SQLException 数据库异常
     */
    @RequestMapping("/getUserInfo")
    public UserInfoVO getUserInfo(@Validated @RequestBody DecoratorDTO dto) throws SQLException {

        return decoratorService.getUserInfo(dto);
    }
}

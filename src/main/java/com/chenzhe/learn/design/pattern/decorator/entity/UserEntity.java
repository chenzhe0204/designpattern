package com.chenzhe.learn.design.pattern.decorator.entity;

import lombok.Data;

/**
 * 用户表实体
 * @author cz
 * @date 2020-08-23
 */
@Data
public class UserEntity {

    /** 账号 */
    private String account;

    /** 密码 */
    private String passWord;

    /** 用户姓名 */
    private String userName;

    /** 电话号码 */
    private String phoneNumber;
}

package com.chenzhe.learn.design.pattern.decorator.vo;

import lombok.Data;

/**
 * 用户信息VO
 * @author cz
 * @date 2020-08-23
 */
@Data
public class UserInfoVO {

    /** 用户姓名 */
    private String userName;

    /** 电话号码 */
    private String phoneNumber;
}

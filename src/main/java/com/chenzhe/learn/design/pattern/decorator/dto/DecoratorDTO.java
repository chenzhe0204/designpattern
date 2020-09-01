package com.chenzhe.learn.design.pattern.decorator.dto;

import com.chenzhe.learn.design.pattern.decorator.group.InsertInfo;
import com.chenzhe.learn.design.pattern.decorator.group.SelectInfo;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 装饰模式DTO
 * @author cz
 * @date 2020-08-23
 */
@Data
public class DecoratorDTO {

    /** 账号 */
    @NotBlank(message = "账号不能为空")
    private String account;

    /** 密码 */
    @NotBlank(message = "密码不能为空")
    private String passWord;

    /** 用户姓名 */
    @NotBlank(groups = InsertInfo.class , message = "姓名不能为空")
    private String userName;

    /** 电话号码 */
    @NotBlank(groups = InsertInfo.class , message = "电话不能为空")
    private String phoneNumber;
}

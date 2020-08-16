package com.chenzhe.learn.design.pattern.simplefactory.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

/**
 * 计算器DTO
 * @author cz
 * @date 2020-08-15
 */
@Data
public class ArithmeticDTO {

    /** 运算符 */
    @NotBlank(message = "运算符不能为空")
    private String operator;

    /** 参数a */
    private BigDecimal a;

    /** 参数b */
    private BigDecimal b;
}

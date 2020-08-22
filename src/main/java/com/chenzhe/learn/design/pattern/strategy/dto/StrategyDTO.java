package com.chenzhe.learn.design.pattern.strategy.dto;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 收费DTO
 * @author cz
 * @date 2020-08-19
 */
@Data
public class StrategyDTO {

    /** 优惠类型(0:无优惠/打折 1:满减) */
    @NotNull(message = "优惠类型不能为空")
    private String strategy;

    /** 优惠前总额 */
    @NotNull(message = "金额不能为空")
    private BigDecimal money;

    /** 折扣 */
    @Max(value = 1,message = "折扣费率不能大于1")
    private BigDecimal discount;

    /** 满减条件 */
    @Min(value = 1,message = "满减条件不能小于1")
    private BigDecimal amount;

    /** 满减金额 */
    @Min(value = 1,message = "满减金额不能小于1")
    private BigDecimal reduce;
}

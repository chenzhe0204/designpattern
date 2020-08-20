package com.chenzhe.learn.design.pattern.strategy.dto;

import lombok.Data;

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

    @NotBlank(message = "优惠类型不能为空")
    private String strategy;

    @NotNull(message = "金额不能为空")
    private BigDecimal money;

    private BigDecimal discount;

    private BigDecimal amount;

    private BigDecimal reduce;
}

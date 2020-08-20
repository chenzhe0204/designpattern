package com.chenzhe.learn.design.pattern.strategy.utils;

import com.chenzhe.learn.design.pattern.strategy.dto.StrategyDTO;

import java.math.BigDecimal;

/**
 * 打折策略
 * @author cz
 */
public class DiscountStrategy implements Strategy{

    /**
     * 打折策略
     * @param dto 参数
     * @return 收费金额
     */
    @Override
    public BigDecimal getChargeAmount(StrategyDTO dto) {
        BigDecimal discount = dto.getDiscount();
        BigDecimal money = dto.getMoney();
        return money.multiply(discount);
    }
}

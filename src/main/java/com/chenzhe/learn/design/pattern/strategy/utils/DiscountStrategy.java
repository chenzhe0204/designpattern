package com.chenzhe.learn.design.pattern.strategy.utils;

import com.chenzhe.learn.design.pattern.strategy.dto.StrategyDTO;
import com.chenzhe.learn.design.pattern.strategy.expection.StrategyException;

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
    public BigDecimal getChargeAmount(StrategyDTO dto) throws StrategyException {
        if (dto.getDiscount() == null || dto.getDiscount().equals(BigDecimal.ZERO)){
            throw new StrategyException("折扣费率不能为空");
        }
        BigDecimal discount = dto.getDiscount();
        BigDecimal money = dto.getMoney();
        return money.multiply(discount);
    }
}

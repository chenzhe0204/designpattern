package com.chenzhe.learn.design.pattern.strategy.utils;

import com.chenzhe.learn.design.pattern.strategy.dto.StrategyDTO;

import java.math.BigDecimal;

/**
 * 满减策略
 * @author cz
 * @date 2020-08-18
 */
public class FullReductionStrategy implements Strategy{

    private static final int VALUE = -1;
    /**
     * 满减算法
     * @param dto 参数
     * @return 收费金额
     */
    @Override
    public BigDecimal getChargeAmount(StrategyDTO dto) {
        BigDecimal amount = dto.getAmount();
        BigDecimal reduce = dto.getReduce();
        BigDecimal money = dto.getMoney();
        //应付金额大于满减金额
        while (money.compareTo(amount) != VALUE){
            money = money.subtract(reduce);
        }
        return money;
    }
}

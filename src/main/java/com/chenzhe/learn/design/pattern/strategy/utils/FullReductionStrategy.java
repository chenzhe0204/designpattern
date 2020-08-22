package com.chenzhe.learn.design.pattern.strategy.utils;

import com.chenzhe.learn.design.pattern.strategy.dto.StrategyDTO;
import com.chenzhe.learn.design.pattern.strategy.expection.StrategyException;

import java.math.BigDecimal;

/**
 * 满减策略
 * @author cz
 * @date 2020-08-18
 */
public class FullReductionStrategy implements Strategy{

    /**
     * 满减算法
     * @param dto 参数
     * @return 收费金额
     */
    @Override
    public BigDecimal getChargeAmount(StrategyDTO dto) throws StrategyException {
        BigDecimal amount = dto.getAmount();
        BigDecimal reduce = dto.getReduce();
        BigDecimal money = dto.getMoney();
        if(amount == null || reduce == null || amount.compareTo(reduce) < 0){
            throw new StrategyException("满减策略不正确");
        }
        //应付金额大于满减金额
        if (money.compareTo(amount) > -1){
            money = money.subtract(reduce);
        }
        return money;
    }
}

package com.chenzhe.learn.design.pattern.strategy.utils;

import com.chenzhe.learn.design.pattern.strategy.dto.StrategyDTO;
import com.chenzhe.learn.design.pattern.strategy.expection.StrategyException;

import java.math.BigDecimal;

/**
 * 上下文
 * 策略模式:定义算法家族,分别封装起来,让其之间可以互相替换,并不影响调用方(封装变化/规则)
 * 策略模式结合简单工厂
 * @author cz
 * @date 2020-08-18
 */
public class StrategyContext {

    private StrategyDTO dto;

    public  StrategyContext (StrategyDTO dto){
        this.dto = dto;
    }

    private  Strategy strategyContext() throws StrategyException {
        Strategy strategy;
        String str = dto.getStrategy();
        switch (str){
            case "0":
                strategy = new DiscountStrategy();
                break;
            case "1":
                strategy = new FullReductionStrategy();
                break;
            default:
                throw new StrategyException("102-请选择正确的结算策略");
        }
        return strategy;
    }

    public BigDecimal getChargeAmount() throws StrategyException {
        Strategy strategy = strategyContext();
        return strategy.getChargeAmount(dto);
    }

}

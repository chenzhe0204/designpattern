package com.chenzhe.learn.design.pattern.strategy.utils;

import com.chenzhe.learn.design.pattern.strategy.dto.StrategyDTO;
import com.chenzhe.learn.design.pattern.strategy.expection.StrategyException;

import java.math.BigDecimal;

/**
 * 算法的公共接口
 * @author cz
 * @date 2020-08-18
 */
public interface Strategy {

    /**
     * 收费算法
     * @param dto 参数
     * @return 收费金额
     * @throws StrategyException 策略模式自定义异常
     */
    BigDecimal getChargeAmount(StrategyDTO dto) throws StrategyException;

}

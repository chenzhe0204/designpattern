package com.chenzhe.learn.design.pattern.strategy.service;

import com.chenzhe.learn.design.pattern.strategy.dto.StrategyDTO;
import com.chenzhe.learn.design.pattern.strategy.expection.StrategyException;

import java.math.BigDecimal;

/**
 * 策略模式service
 * @author cz
 * @date 2020-08-19
 */
public interface StrategyService {

    /**
     * 获得应付金额
     * @param dto 参数实体
     * @return 应付金额
     * @throws StrategyException 异常
     */
    BigDecimal getChargeAmount(StrategyDTO dto) throws StrategyException;
}

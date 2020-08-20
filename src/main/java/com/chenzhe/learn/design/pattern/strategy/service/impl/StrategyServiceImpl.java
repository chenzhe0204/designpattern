
package com.chenzhe.learn.design.pattern.strategy.service.impl;

import com.chenzhe.learn.design.pattern.strategy.dto.StrategyDTO;
import com.chenzhe.learn.design.pattern.strategy.expection.StrategyException;
import com.chenzhe.learn.design.pattern.strategy.service.StrategyService;
import com.chenzhe.learn.design.pattern.strategy.utils.StrategyContext;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


/**
 * 策略模式service
 *
 * @author cz
 * @date 2020-08-19
 */
@Service
public class StrategyServiceImpl implements StrategyService {

    /**
     * 获得应付金额
     * @param dto 参数map
     * @return 应付金额
     * @throws StrategyException 异常
     */
    @Override
    public BigDecimal getChargeAmount(StrategyDTO dto) throws StrategyException {
        StrategyContext context = new StrategyContext(dto);
        return context.getChargeAmount();
    }

}


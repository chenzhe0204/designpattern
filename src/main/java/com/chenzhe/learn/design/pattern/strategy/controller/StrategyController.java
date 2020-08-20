package com.chenzhe.learn.design.pattern.strategy.controller;

import com.chenzhe.learn.design.pattern.strategy.dto.StrategyDTO;
import com.chenzhe.learn.design.pattern.strategy.expection.StrategyException;
import com.chenzhe.learn.design.pattern.strategy.service.StrategyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * 策略模式controller
 * @author cz
 * @date 2020-08-17
 */
@RestController
@RequestMapping("/strategy")
@Slf4j
@RequiredArgsConstructor(onConstructor_={@Autowired})
public class StrategyController {

    private final StrategyService strategyService;

    @RequestMapping("/getChargeAmount")
    public BigDecimal getChargeAmount(@Validated @RequestBody StrategyDTO dto) throws StrategyException {
        return strategyService.getChargeAmount(dto);
    }
}

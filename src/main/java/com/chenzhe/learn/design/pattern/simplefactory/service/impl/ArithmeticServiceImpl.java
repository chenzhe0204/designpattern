package com.chenzhe.learn.design.pattern.simplefactory.service.impl;

import com.chenzhe.learn.design.pattern.simplefactory.dto.ArithmeticDTO;
import com.chenzhe.learn.design.pattern.simplefactory.exception.ArithmeticException;
import com.chenzhe.learn.design.pattern.simplefactory.service.ArithmeticService;
import com.chenzhe.learn.design.pattern.simplefactory.utils.Arithmetic;
import com.chenzhe.learn.design.pattern.simplefactory.utils.ArithmeticSimpleFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 简单工厂(计算器)service
 * @author cz
 * @date 2020-08-15
 */
@Slf4j
@Service
public class ArithmeticServiceImpl implements ArithmeticService {

    /**
     * 获取计算结果
     * @param dto 参数类
     * @return 结果
     * @throws ArithmeticException 运算异常
     */
    @Override
    public BigDecimal getResult(ArithmeticDTO dto) throws ArithmeticException {
        Arithmetic arithmetic = ArithmeticSimpleFactory.getArithmetic(dto.getOperator());
        return arithmetic.getResult(dto.getA(),dto.getB());
    }
}

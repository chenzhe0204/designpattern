package com.chenzhe.learn.design.pattern.simplefactory.service;

import com.chenzhe.learn.design.pattern.simplefactory.dto.ArithmeticDTO;
import com.chenzhe.learn.design.pattern.simplefactory.exception.ArithmeticException;

import java.math.BigDecimal;

/**
 * 简单工厂(计算器)service
 * @author cz
 * @date 2020-08-15
 */
public interface ArithmeticService {

    /**
     * 获取计算结果
     * @param dto 参数类
     * @return 结果
     * @throws  ArithmeticException 运算异常
     */
    BigDecimal getResult(ArithmeticDTO dto) throws ArithmeticException;
}

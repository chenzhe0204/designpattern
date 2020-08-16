package com.chenzhe.learn.design.pattern.simplefactory.utils;

import com.chenzhe.learn.design.pattern.simplefactory.exception.ArithmeticException;

import java.math.BigDecimal;

/**
 * 算法
 * @author cz
 */
public interface Arithmetic {
    /**
     * 算法
     * @param a 参数a
     * @param b 参数b
     * @exception ArithmeticException 计算异常
     * @return 结果
     */
    BigDecimal getResult(BigDecimal a,BigDecimal b) throws ArithmeticException;
}

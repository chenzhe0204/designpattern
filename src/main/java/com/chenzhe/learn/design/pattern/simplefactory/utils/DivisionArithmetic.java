package com.chenzhe.learn.design.pattern.simplefactory.utils;

import com.chenzhe.learn.design.pattern.simplefactory.exception.ArithmeticException;

import java.math.BigDecimal;

/**
 * 除法
 * @author cz
 */
public class DivisionArithmetic implements Arithmetic {

    @Override
    public BigDecimal getResult(BigDecimal a, BigDecimal b) throws ArithmeticException {
        if (b.compareTo(BigDecimal.ZERO)==0){
            throw new ArithmeticException("101-除数不能为0");
        }
        return a.divide(b,2);
    }
}

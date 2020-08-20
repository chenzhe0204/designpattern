package com.chenzhe.learn.design.pattern.simplefactory.utils;

import com.chenzhe.learn.design.pattern.simplefactory.exception.ArithmeticException;
import lombok.extern.slf4j.Slf4j;

/**
 * 算法简单工厂
 * 简单工厂模式是为了解决对象创建问题
 * @author cz
 * @date 2020-08-15
 */
@Slf4j
public class ArithmeticSimpleFactory {

    public static Arithmetic getArithmetic (String operator) throws ArithmeticException {
        Arithmetic arithmetic;
        switch (operator){
            case "+":
                arithmetic = new AddArithmetic();
                log.info("执行加法运算");
                break;
            case "-":
                arithmetic = new SubtractionArithmetic();
                log.info("执行减法运算");
                break;
            case "*":
                arithmetic = new MultiplicationArithmetic();
                log.info("执行乘法运算");
                break;
            case "/":
                arithmetic = new DivisionArithmetic();
                log.info("执行除法运算");
                break;
            default:
                log.error("运算符异常");
                throw new ArithmeticException("101-请输入正确的运算符号");
        }
        return arithmetic;
    }
}

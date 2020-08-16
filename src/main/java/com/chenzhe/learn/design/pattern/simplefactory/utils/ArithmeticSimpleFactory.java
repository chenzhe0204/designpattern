package com.chenzhe.learn.design.pattern.simplefactory.utils;

import com.chenzhe.learn.design.pattern.simplefactory.exception.ArithmeticException;
/**
 * 算法简单工厂
 * @author cz
 */
public class ArithmeticSimpleFactory {

    public static Arithmetic getArithmetic (String operator) throws ArithmeticException {
        Arithmetic arithmetic;
        switch (operator){
            case "+":
                arithmetic = new AddArithmetic();
                break;
            case "-":
                arithmetic = new SubtractionArithmetic();
                break;
            case "*":
                arithmetic = new MultiplicationArithmetic();
                break;
            case "/":
                arithmetic = new DivisionArithmetic();
                break;
            default:
                throw new ArithmeticException("101-请输入正确的运算符号");
        }
        return arithmetic;
    }
}

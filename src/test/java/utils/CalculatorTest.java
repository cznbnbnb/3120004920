package utils;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void findMaxDivisorTest(){
        //寻找最大公约数测试
        System.out.println(Calculator.findMaxDivisor(15,9));
        System.out.println(Calculator.findMaxDivisor(2,9));
        System.out.println(Calculator.findMaxDivisor(15,45));
        System.out.println(Calculator.findMaxDivisor(15,34));
        System.out.println(Calculator.findMaxDivisor(3423,432));
    }
    @Test

    public void fractionOperTest() {
        System.out.println(Calculator.fractionOper("6/1 * 1/6"));
        System.out.println(Calculator.fractionOper("6/6 - 6/10"));
        System.out.println(Calculator.fractionOper("0/7 + 0/9"));
        System.out.println(Calculator.fractionOper("4/5 * 8/4"));
        System.out.println(Calculator.fractionOper("8/1 + 7/4"));
    }
}

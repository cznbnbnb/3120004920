package utils;

import java.util.*;

public class Calculator {
    public static int findMaxDivisor(int num1, int num2){
        //0.欧几里得法求最大公约数
        int a, b;
        if (num1 > num2){
            a = Math.abs(num1);   b = Math.abs(num2);
        }else {
            b = Math.abs(num1);   a = Math.abs(num2);
        }
        int demp = a%b;
        if (demp == 0)
            return b;
        else
            return findMaxDivisor(b,demp);
    }
    public static String fractionOper(String operation) {
        //0.获得分数和运算符
        String[] members = operation.split("\\s");
        String num1 = members[0];
        String num2 = members[2];
        String oper = members[1];
        //1.获得分子分母
        int[] mol = new int[2];
        int[] den = new int[2];
        String[] num = num1.split("/");
        mol[0] = Integer.parseInt(num[0]);
        den[0] = Integer.parseInt(num[1]);
        num = num2.split("/");
        mol[1] = Integer.parseInt(num[0]);
        den[1] = Integer.parseInt(num[1]);
        //2.找到最大公约数
        int mutiple = 0;
        int maxDivisor = findMaxDivisor(den[0], den[1]);
        mutiple = den[0]/maxDivisor*den[1];
        //3.根据运算符匹配计算
        int mols, dens;
        switch (oper){
            case "+":{
                mols = mol[0] * (den[1]/maxDivisor) + mol[1] * (den[0]/maxDivisor);
                if (mols == 0){
                    return "0";
                }else {
                    maxDivisor = findMaxDivisor(mols,mutiple);
                    if (mols % mutiple == 0)
                        return Integer.toString(mols/mutiple);
                    else
                        return mols/maxDivisor + "/" + mutiple/maxDivisor;
                }
            }
            case "-":{
                mols = mol[0] * (den[1]/maxDivisor) - mol[1] * (den[0]/maxDivisor);
                if (mols == 0){
                    return "0";
                }else {
                    maxDivisor = findMaxDivisor(mols, mutiple);
                    if (mols % mutiple == 0)
                        return Integer.toString(mols / mutiple);
                    else
                        return mols / maxDivisor + "/" + mutiple / maxDivisor;
                }
            }
            case "*":{
                if (mol[0] == 0||mol[1] == 0){
                    return "0";
                } else{
                    mols = mol[0]*mol[1];
                    dens = den[0]*den[1];
                    maxDivisor = findMaxDivisor(mols,dens);
                    String mark = mols*dens >0? "": "-";
                    if ( mols % dens == 0)
                        return Integer.toString(mols / dens);
                    else
                        return mark
                                + Math.abs(mols)/maxDivisor
                                + "/"
                                + Math.abs(dens)/maxDivisor;
                }
            }
            case "÷":{
                if (mol[0] == 0)
                    return "0";
                else if (mol[1] == 0)
                    return null;
                else {
                    mols = mol[0]*den[1];
                    dens = den[0]*mol[1];
                    maxDivisor = findMaxDivisor(mols,dens);
                    String mark = mols*dens >0? "": "-";
                    if (mols % dens == 0)
                        return Integer.toString(mols / dens);
                    else
                        return mark
                                + Math.abs(mols)/maxDivisor
                                + "/"
                                + Math.abs(dens)/maxDivisor;
                }
            }
        }
        return null;
    }

}

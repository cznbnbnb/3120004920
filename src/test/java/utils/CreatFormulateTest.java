package utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CreatFormulateTest {
    @Test
    public void CreatTest(){
        //生成算式并输入到目标文件
        CreatFormulate.Creat(100,10,"D:/test/ExercisesTest1.txt","D:/test/AnswersTest1.txt");
        CreatFormulate.Creat(200,20,"D:/test/ExercisesTest2.txt","D:/test/AnswersTest2.txt");
        CreatFormulate.Creat(1000,50,"D:/test/ExercisesTest3.txt","D:/test/AnswersTest3.txt");
        CreatFormulate.Creat(10000,100,"D:/test/ExercisesTest4.txt","D:/test/AnswersTest4.txt");
    }
}

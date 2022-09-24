package utils;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

/**
 * 读写txt文件的工具类
 */
public class TxtIOTest {

 
    @Test
    public void readTxtTest() {
        // 路径存在，正常读取
        ArrayList<String> strs = TxtIOUtil.readTxt("D:/test/Answers.txt");
        for (String string : strs) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxtTest() {
        // 路径存在，正常写入
        ArrayList<String> arrayList= TxtIOUtil.readTxt("D:/test/Answers.txt");;
        TxtIOUtil.writeTxt(arrayList, "D:/test/TxtIOTest.txt");

    }

    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = TxtIOUtil.readTxt("D:/test/none.txt");
    }

    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            TxtIOUtil.writeTxt(elem[i], "User:/test/ans.txt");
        }
}

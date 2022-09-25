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
        System.out.println("读取成功...");
    }

    @Test
    public void writeTxtTest() {
        // 路径存在，正常写入
        ArrayList<String> arrayList= TxtIOUtil.readTxt("D:/test/Answers.txt");
        TxtIOUtil.writeTxt(arrayList, "D:/test/TxtIOTest.txt");
        System.out.println("写入成功");
    }

    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        ArrayList<String> arrayList = TxtIOUtil.readTxt("D:/test/none.txt");
    }

    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        ArrayList<String> arrayList= TxtIOUtil.readTxt("D:/test/Answers.txt");
        TxtIOUtil.writeTxt(arrayList, "User:/test/none.txt");
        }
}

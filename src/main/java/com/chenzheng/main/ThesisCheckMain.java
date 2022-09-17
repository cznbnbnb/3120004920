package com.chenzheng.main;

import com.chenzheng.utils.HammingUtil;
import com.chenzheng.utils.SimHashUtil;
import com.chenzheng.utils.TxtIOUtil;

public class ThesisCheckMain {

    public static void main(String[] args) {
        // 从命令行输入的路径名读取对应的文件，将文件的内容转化为对应的字符串
        String str0 = TxtIOUtil.readTxt(args[0]);
        String str1 = TxtIOUtil.readTxt(args[1]);
        //从命令行输入写入文件的绝对路径名
        String resultFileName = args[2];
        // 由字符串得出对应的 simHash值
        String simHash0 = SimHashUtil.getSimHash(str0);
        String simHash1 = SimHashUtil.getSimHash(str1);
        // 由 simHash值求出相似度
        double similarity = HammingUtil.getSimilarity(simHash0, simHash1);
        // 把相似度写入最后的结果文件中
        TxtIOUtil.writeTxt(similarity, resultFileName);
        // 退出程序
        System.exit(0);
    }

}
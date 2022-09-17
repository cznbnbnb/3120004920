package com.chenzheng.utils;

import com.chenzheng.exception.CustomException;
import com.hankcs.hanlp.HanLP;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;

public class SimHashUtil {

    /**
     * 传入String，计算出它的hash值，并以字符串形式输出，服务于getSimHash
     * @param str 传入的Srting类型字符串
     * @return 返回str的hash值
     */
    public static String getHash(String str){
        try{
            //使用MD5来获得字符的hash值
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return new BigInteger(1, messageDigest.digest(str.getBytes("UTF-8"))).toString(2);
        }catch(Exception e){
            e.printStackTrace();
            return str;
        }
    }

    /**
     * 传入String,计算出它的simHash值，并以字符串形式输出
     * @param str 传入的Srting类型字符串
     * @return 返回str的simHash值
     */
    public static String getSimHash(String str) {
        // 文本长度太短时HanLp无法取得关键字,抛出文本过短异常
        try {
            if (str.length() < 200) {
                throw new CustomException("文本过短！");
            }
        } catch (CustomException e) {
            e.printStackTrace();
            return null;
        }
        // 用数组表示特征向量,取128位,从 0 1 2 位开始表示从高位到低位
        int[] v = new int[128];
        // 1、分词（使用了maven导入的hankcs包提供的功能）
        // 取出所有关键词放入keywordList中
        List<String> keywordList = HanLP.extractKeyword(str, str.length());
        // hash
        int size = keywordList.size();
        //以i做外层循环
        int i = 0;
        for (String keyword : keywordList) {
            // 2、获取hash值
            String keywordHash = getHash(keyword);
            if (keywordHash.length() < 128) {
                // hash值可能少于128位，在低位以0补齐
                int dif = 128 - keywordHash.length();
                for (int j = 0; j < dif; j++) {
                    keywordHash += "0";
                }
            }
            // 3、加权、合并
            for (int j = 0; j < v.length; j++) {
                // 对keywordHash的每一位与'1'进行比较
                if (keywordHash.charAt(j) == '1') {
                    //权重分10级，由词频从高到低，取权重10~0
                    v[j] += (10 - (i / (size / 10)));
                } else {
                    v[j] -= (10 - (i / (size / 10)));
                }
            }
            i++;
        }
        // 4、降维
        // 存放返回的simHash值
        String simHash = "";
        int j = 0;
        while (j < v.length) {
            // 从高位遍历到低位
            if (v[j] <= 0) {
                simHash += "0";
            } else {
                simHash += "1";
            }
            j++;
        }
        return simHash;
    }
}

package com.chenzheng.utils;

public class HammingUtil {

    /**
     * 传入获取的两个simHash值，计算它们的海明距离，服务于getSimilarity
     * @param simHash1
     * @param simHash2
     * @return 海明距离
     */
    public static int getHammingDistance(String simHash1, String simHash2) {
        //定义返回的海明距离
        int hammingDistance = 0;
        if (simHash1.length() != simHash2.length()) {
            // 数据出错，返回-1
            hammingDistance = -1;
        } else {
            for (int i = 0; i < simHash1.length(); i++) {
                // 每一位进行比较
                if (simHash1.charAt(i) != simHash2.charAt(i)) {
                    hammingDistance++;
                }
            }
        }
        return hammingDistance;
    }

    /**
     * 输入两个simHash值，输出相似度
     * @param simHash1
     * @param simHash2
     * @return 相似度
     */
    public static double getSimilarity(String simHash1, String simHash2) {
        // 通过 simHash1 和 simHash2 获得它们的海明距离
        int distance = getHammingDistance(simHash1, simHash2);
        // 通过海明距离计算出相似度，并返回
        return 0.01 * (100 - distance * 100 / 128);
    }

}

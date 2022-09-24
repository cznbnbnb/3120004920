package utils;

import java.io.*;
import java.util.ArrayList;

/**
 * 读写txt文件的工具类
 */
public class TxtIOUtil {

    /**
     * 简单的TXT读取工具类，读出txt文件
     * 传入文件绝对路径，将文件内容转化为 String字符串输出
     * @param txtPath 文件路径
     * @return 文件内容
     */
    public static ArrayList<String> readTxt(String txtPath) {
        ArrayList<String> arraylist = new ArrayList<>();
        String strLine;
        // 将 txt文件按行读入 str中
        File file = new File(txtPath);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // 字符串拼接
            while ((strLine = bufferedReader.readLine()) != null) {
                arraylist.add(strLine) ;
            }
            // 关闭资源
            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arraylist;
    }

    /**
     * 写入txt文件
     * 传入内容、文件全路径名，将内容写入文件并换行
     * @param arrayList 传入的内容
     * @param txtPath 写入的文件路径
     */
    public static void writeTxt(ArrayList<String> arrayList, String txtPath){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(txtPath);
            for (int i = 0; i < arrayList.size(); i++) {
                fileWriter.append(arrayList.get(i)+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void writeTxt(String s, String txtPath){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(txtPath);
            fileWriter.append(s);

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

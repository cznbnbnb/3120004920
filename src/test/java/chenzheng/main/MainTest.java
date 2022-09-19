package chenzheng.main;

import com.chenzheng.utils.HammingUtil;
import com.chenzheng.utils.SimHashUtil;
import com.chenzheng.utils.TxtIOUtil;
import org.junit.Test;

public class MainTest {

    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = TxtIOUtil.readTxt("D:/test/orig.txt");
        str[1] = TxtIOUtil.readTxt("D:/test/orig_0.8_add.txt");
        str[2] = TxtIOUtil.readTxt("D:/test/orig_0.8_del.txt");
        str[3] = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_1.txt");
        str[4] = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_10.txt");
        str[5] = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_15.txt");
        //源文档和所有目标文档的比较结果放在这个文件中
        String resFileName = "D:/test/resAll.txt";
        for(Integer i = 0; i <= 5; i++){
            String mes = "第"+(i+1)+"个文件";
            double res = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str[0]), SimHashUtil.getSimHash(str[i]));
            TxtIOUtil.writeTxt(mes,resFileName);
            TxtIOUtil.writeTxt(res, resFileName);
        }
    }

    @Test
    public void origAndOrigTest(){
        //源文件与源文件的对比测试
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String resFileName = "D:/test/resOrigAndOrigTest.txt";
        double res = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        String mes = "源文件";
        TxtIOUtil.writeTxt(mes,resFileName);
        TxtIOUtil.writeTxt(res, resFileName);

    }

    @Test
    public void origAndAddTest(){
        //源文件与增量文件的对比
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_add.txt");
        String resFileName = "D:/test/resOrigAndAddTest.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        String mes = "增文件";
        TxtIOUtil.writeTxt(mes,resFileName);
        TxtIOUtil.writeTxt(ans, resFileName);
    }

    @Test
    public void origAndDelTest(){
        //源文件与删文件的对比
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_del.txt");
        String resFileName = "D:/test/resOrigAndDelTest.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        String mes = "删文件";
        TxtIOUtil.writeTxt(mes,resFileName);
        TxtIOUtil.writeTxt(ans, resFileName);
    }

    @Test
    public void origAndDis1Test(){
        //源文件与dis_1文件的对比
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_1.txt");
        String resFileName = "D:/test/resOrigAndDis1Test.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        String mes = "dis_1文件";
        TxtIOUtil.writeTxt(mes,resFileName);
        TxtIOUtil.writeTxt(ans, resFileName);
    }

    @Test
    public void origAndDis10Test(){
        //源文件与dis_10文件的对比
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_10.txt");
        String resFileName = "D:/test/resOrigAndDis10Test.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        String mes = "dis_10文件";
        TxtIOUtil.writeTxt(mes,resFileName);
        TxtIOUtil.writeTxt(ans, resFileName);
    }

    @Test
    public void origAndDis15Test(){
        //源文件与dis_15文件的对比
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_15.txt");
        String resFileName = "D:/test/resOrigAndDis15Test.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        String mes = "dis_15文件";
        TxtIOUtil.writeTxt(mes,resFileName);
        TxtIOUtil.writeTxt(ans,resFileName);
    }

}

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
        String ansFileName = "D:/test/ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str[0]), SimHashUtil.getSimHash(str[i]));
            TxtIOUtil.writeTxt(ans, ansFileName);
        }
    }

    @Test
    public void origAndOrigTest(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String ansFileName = "D:/test/ansOrigAndOrigTest.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_add.txt");
        String ansFileName = "D:/test/ansOrigAndAddTest.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_del.txt");
        String ansFileName = "D:/test/ansOrigAndDelTest.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis1Test(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_1.txt");
        String ansFileName = "D:/test/ansOrigAndDis1Test.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_10.txt");
        String ansFileName = "D:/test/ansOrigAndDis10Test.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_15.txt");
        String ansFileName = "D:/test/ansOrigAndDis15Test.txt";
        double ans = HammingUtil.getSimilarity(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        TxtIOUtil.writeTxt(ans,ansFileName);
    }

}

package chenzheng.utils;

import com.chenzheng.utils.SimHashUtil;
import com.chenzheng.utils.TxtIOUtil;
import org.junit.Test;

public class SimHashUtilsTest {

    @Test
    public void getHashTest(){
        String[] strings = {"贾浅浅", "不算", "一名","优秀", "的", "作家"};
        for (String string : strings) {
            String stringHash = SimHashUtil.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_add.txt");
        System.out.println(SimHashUtil.getSimHash(str0));
        System.out.println(SimHashUtil.getSimHash(str1));
    }

}

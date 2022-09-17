package chenzheng.exception;

import com.chenzheng.utils.SimHashUtil;
import org.junit.Test;

public class CustomExceptionTest {

    @Test
    public void shortStringExceptionTest(){
        //测试str.length()<200的情况
        System.out.println(SimHashUtil.getSimHash("一位正真的作家"));
    }

}

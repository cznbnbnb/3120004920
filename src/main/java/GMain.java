import utils.CreatFormulate;
import utils.Judgment;
import utils.TxtIOUtil;

import java.util.Scanner;

public class GMain {
    /**
     * 四则运算生成器
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("请输入想要使用的功能:\n1:生成题目\n2:判断错误");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a == 1){
            CreatFormulate.Creat();
        }else {
            String jud = Judgment.Judge("D:/test/Answers.txt","D:/test/Ans.txt");
            TxtIOUtil.writeTxt(jud,"D:/test/Judgment.txt");
        }



    }
}

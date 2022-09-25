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
            Scanner input=new Scanner(System.in);
            System.out.println("请输入要输出多少道运算题");
            int howMany=input.nextInt();
            System.out.println("请输入你要计算数的最大值");
            int max=input.nextInt();
            CreatFormulate.Creat(howMany,max,"D:/test/Exercises.txt","D:/test/Answers.txt");
        }else {
            String jud = Judgment.Judge("D:/test/Answers.txt","D:/test/Ans.txt");
            TxtIOUtil.writeTxt(jud,"D:/test/Judgment.txt");
        }



    }
}

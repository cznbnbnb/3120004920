package utils;
import java.util.*;
public class CreatFormulate {
    public static void Creat(){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要输出多少道运算题");
        int h=input.nextInt();
        String [] arr1=new String[h];
        System.out.println("请输入你要计算数的最大值");
        int g=input.nextInt();
        Random random = new Random();
        char arr[] = {'+','-','*','÷'};
        ArrayList<String> exercises = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();
        int j = 0;
        for(int i=0;i<h;i++)
        {
            j = i+1;
            int u=random.nextInt(g);
            int v=random.nextInt(g)+1;
            char w=arr[random.nextInt(4)];
            int flag = random.nextInt(2);
            if (flag==1){
                if(w=='-'&&(u<v)){
                    i--;
                }else {
                    exercises.add(j+": "+u+" "+w+" "+v);
                    answers.add(j+": "+Calculator.fractionOper(u+"/1 "+w+" "+v+"/1"));
                }
            }else {
                int x=random.nextInt(g);
                int y=random.nextInt(g)+1;
                if(w=='-'&&((double)u/(double)v)<((double)x/(double)y)){
                    i--;
                }else {
                    exercises.add(j+": "+u+"/"+v+" "+w+" "+x+"/"+y);
                    answers.add(j+": "+Calculator.fractionOper(u+"/"+v+" "+w+" "+x+"/"+y));
                }

            }

        }
        TxtIOUtil.writeTxt(exercises,"D:/test/Exercises.txt");
        TxtIOUtil.writeTxt(answers,"D:/test/Answers.txt");


    }
}
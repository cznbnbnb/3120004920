package utils;
import java.util.*;
public class CreatFormulate {
    public static void Creat(int howMany,int max,String exercisesTxt,String answersTxt){
        String [] arr1=new String[howMany];
        Random random = new Random();
        char arr[] = {'+','-','*','÷'};
        ArrayList<String> exercises = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();
        int j = 0;
        for(int i=0;i<howMany;i++)
        {
            j = i+1;
            int u=random.nextInt(max);
            int v=random.nextInt(max)+1;
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
                int x=random.nextInt(max);
                int y=random.nextInt(max)+1;
                if(w=='-'&&((double)u/(double)v)<((double)x/(double)y)){
                    i--;
                }else {
                    exercises.add(j+": "+u+"/"+v+" "+w+" "+x+"/"+y);
                    answers.add(j+": "+Calculator.fractionOper(u+"/"+v+" "+w+" "+x+"/"+y));
                }

            }

        }
        TxtIOUtil.writeTxt(exercises,exercisesTxt);
        TxtIOUtil.writeTxt(answers,answersTxt);
    }
}
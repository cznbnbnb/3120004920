package utils;

import java.util.ArrayList;

public class Judgment {
    public static String Judge(String answersPath,String txtPath){
        ArrayList<String> answers = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        answers = TxtIOUtil.readTxt(answersPath);
        ans = TxtIOUtil.readTxt(txtPath);
        String correct = "";
        String wrong = "";
        int k = 0;
        for (int i = 0; i < answers.size(); i++) {
            k = i+1;
            if (answers.get(i).equals(ans.get(i))){
                correct+=k+",";
            }else {
                wrong+=k+",";
            }
        }

        String[] n = correct.split(",");
        int j = n.length;
        correct = correct.substring(0,correct.length()-1);
        correct = "Correct: "+j+" ("+correct+")";
        wrong = wrong.substring(0,wrong.length()-1);
        wrong = "Wrong: "+(answers.size()-j)+" ("+wrong+")";
        String res = correct+"\n"+wrong;
        return res;
    }
}

package backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 17.电话号码的组合(STUCK)
 */
public class LetterCombinations {
    private String letterMap[] = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    private ArrayList<String> list;

    public List<String> solution(String digits){
        list=new ArrayList<>();
        if(digits.equals("")){
           return list;
        }

    }

    private void find(String digits,int index,String s){

    }
}
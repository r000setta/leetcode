package backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 784.字母大小写全排列
 */
public class LetterSwitch {

    public List<String> solution(String S){
        List<String> ans=new ArrayList<>();
        dg(S.toCharArray(),0,ans);
        return ans;
    }

    public void dg(char[] s, int i, List<String> ans){
        if (i==s.length){
            ans.add(String.valueOf(s));
            return;
        }
        dg(s,i+1,ans);
        if (s[i]<'0'||s[i]>'9'){
            s[i]^=(1<<5);
            dg(s,i+1,ans);
        }
    }
}

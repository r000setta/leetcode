package ez;

/**
 * 392.判断子序列
 */
public class isSubSequence {
    public boolean solution(String s,String t){
        if (s.equals("")){
            return true;
        }
        if (t.equals(""))
            return false;
        int tmp=0;
        for (int i=0;i<t.length();i++){
            if (t.charAt(i)==s.charAt(tmp)){
                tmp++;
                if (tmp==s.length())
                    return true;
            }
        }
        return false;
    }
}

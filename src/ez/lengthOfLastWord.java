package ez;

/**
 * 58.最后单词的长度
 */
public class lengthOfLastWord {
    public int solution(String s){
        try {
            String[] strs=s.split(" ");
            String res=strs[strs.length-1];
            return res.length();
        }catch (Exception e){
            return 0;
        }
    }
}
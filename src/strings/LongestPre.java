package strings;

/**
 * 14.最长公共前缀
 */
public class LongestPre {
    public String solution(String[] strs){
        if (strs.length==0)
            return "";
        String prefix=strs[0];
        for (int i=0;i<strs.length;i++){
            while (strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}

package strings;

/**
 * 647.回文子串
 */
public class PalindromicSubStrings {
    public int countSubstrings(String s){
        int result=0;
        for(int i=0;i<s.length();i++){
            result+=countSegment(s,i,i);
            result+=countSegment(s,i,i+1);
        }
        return result;
    }

    private int countSegment(String s,int start,int end){
        int count=0;
        while (start>=0&&end<s.length()&&s.charAt(start--)==s.charAt(end++)){
            count++;
        }
        return count;
    }
}

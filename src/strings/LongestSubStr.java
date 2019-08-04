package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubStr {
    static public int lengthOfLongestSubstring(String s) {
        List<Character> list=new ArrayList<>();
        int max=1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                if (!list.contains(c)){
                    list.add(c);
                }else{
                    max=Math.max(list.size(),max);
                    list.clear();
                    break;
                }
            }
        }
        return max;
    }

    public int betterWay(String s){
        int n=s.length();
        Set<Character> set=new HashSet<>();
        int ans=0,i=0,j=0;
        while (i<n&&j<n){
            //extend the range [i,j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans=Math.max(ans,j-1);
            }else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}

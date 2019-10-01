package ez;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 693.交替二进制数
 */
public class hasAlternatingBits {
    public boolean solution(int n){
        String s=Integer.toBinaryString(n);
        char[] chars=s.toCharArray();
        int old=0;
        for (int i=1;i<chars.length;i++){
            if (chars[i]==chars[old]){
                return false;
            }
            old=i;
        }
        return true;
    }
}

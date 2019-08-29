package greedy;

import java.util.Arrays;
import java.util.List;

/**
 * 455.分发饼干
 */
public class findContentChildren {
    public int solution(int[] g,int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,r=0;
        while (l < g.length && r < s.length) {
            if (g[l]<=s[r++]  )
                l++;
        }
        return l;
    }
}

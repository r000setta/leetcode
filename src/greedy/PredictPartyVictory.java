package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * 649.Dota2参议院（Stuck）
 */
public class PredictPartyVictory {
    public String solution(String senate) {
        boolean R = true, D = true;
        char[] arr = senate.toCharArray();
        int person = 0;
        while (R && D) {
            R = false;
            D = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'R') {
                    R = true;
                    if (person < 0)
                        arr[i] = 'o';
                    ++person;
                } else if (arr[i] == 'D') {
                    D = true;
                    if (person > 0)
                        arr[i] = 'o';
                    --person;
                }
            }
        }
        return person > 0 ? "Radiant" : "Dire";
    }
}
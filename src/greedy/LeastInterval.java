package greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * 621.任务调度器
 */
public class LeastInterval {
    public int solution(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        for (char task : tasks) {

            if (map.containsKey(task)) {
                int count = map.get(task);
                map.put(task, ++count);
            } else {
                map.put(task, 1);
            }

        }
        int max = Integer.MIN_VALUE;
        int num = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count > max)
                max = count;
            if (count == max) {
                num++;
            }
        }
        int res = (max - 1) * (n + 1) + num;
        return res>tasks.length?res:tasks.length;
    }
}
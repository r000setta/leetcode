package bfs;

import java.util.*;

public class canVisitAllRooms {
    public boolean solution(List<List<Integer>> rooms){
        Queue<Integer> queue=new ArrayDeque<>();
        List<Integer> list=new ArrayList<>();
        list.add(0);
        for (int i:rooms.get(0)){
            if (!list.contains(i)){
                list.add(i);
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            List<Integer> tmp=rooms.get(queue.poll());
            for (int i:tmp){
                if (!list.contains(i)){
                    list.add(i);
                    queue.offer(i);
                }
            }
        }
        return list.size()==rooms.size();
    }
}
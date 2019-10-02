package bfs;

import java.util.*;

/**
 * 690. 员工的重要性
 */
public class getImportance {
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };

    public int solution(List<Employee> employees,int id){
        Map<Integer,Employee> map=new HashMap<>();
        for (Employee employee:employees){
            map.put(employee.id,employee);
        }
        Employee root=map.get(id);
        int res=0;
        Queue<Employee> queue=new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Employee tmp=queue.poll();
            res+=tmp.importance;
            if (tmp.subordinates.size()!=0){
                for (int i:tmp.subordinates){
                    queue.offer(map.get(i));
                }
            }
        }
        return res;
    }
}
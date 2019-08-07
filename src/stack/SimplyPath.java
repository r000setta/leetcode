package stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 71.简化路径
 */
public class SimplyPath {
    public String solution(String path){
        Deque<String> stack=new LinkedList<>();
        for (String item:path.split("/")){
            if (item.equals("..")){
                if (!stack.isEmpty())
                    stack.pop();
            }else if (!item.isEmpty()&&!item.equals("."))
                stack.push(item);
        }
        String res="";
        for (String d:stack)
            res="/"+d+res;
        return res.isEmpty()?"/":res;
    }
}

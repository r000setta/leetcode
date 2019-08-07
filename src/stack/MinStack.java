package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 155-最小栈
 */
public class MinStack {
    private Stack<Integer> data;

    private Stack<Integer> helper;

    public MinStack(){
        data=new Stack<>();
        helper=new Stack<>();
    }

    public void push(int x){
        data.add(x);
        if (helper.isEmpty()||helper.peek()>=x){
            helper.add(x);
        }else {
            helper.add(helper.peek());
        }
    }

    public void pop(){
        if (!data.isEmpty()){
            helper.pop();
            data.pop();
        }
    }

    public int top(){
        if (!data.isEmpty()){
            return data.peek();
        }
        throw new RuntimeException();
    }

    public int getMin(){
        if (!helper.isEmpty()){
            return helper.peek();
        }
        throw new RuntimeException();
    }
}

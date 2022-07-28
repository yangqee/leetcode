package DataStructure;

import java.util.Stack;

/**
 * @author yangqee
 * @date 2022/7/18 10:12 下午
 */
//232. Implement Queue using Stacks
public class Code06_Stack_leetcode232 {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public void MyQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    private void s1Tos2() {
        if(s2.empty()){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            s1Tos2();
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            s1Tos2();
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    public static void main(String[] args){
        System.out.println();
    }
}
package com.yangqee;

import java.util.Collection;
import java.util.TreeMap;

public class Main {
    public static String removeOuterParentheses(String s) {
        int pair = 0;
        int ini = 0;
        StringBuffer res = new StringBuffer();
        for (int i = 0; i< s.length(); i++){
            if (s.charAt(i) == ')'){
                pair --;
            }
            if(pair!=0){
                res.append(s.charAt(i)) ;
            }
            if (s.charAt(i) == '('){
                pair ++;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }
}



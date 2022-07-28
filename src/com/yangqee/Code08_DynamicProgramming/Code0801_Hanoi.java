package com.yangqee.Code08_DynamicProgramming;

/**
 * @author yangqee
 * @date 2022/7/27 3:25 下午
 */
public class Code0801_Hanoi {
    /*
    暴力递归：即尝试
    1.把问题转化为规模缩小了的同类问题的子问题
    2.有明确的不需要急需进行递归的条件（base case)
    3.有当得到了子问题的结果之后的决策过程（回溯完了之后做决策，加工出大问题需要的信息往上返回）
    4.不记录每个子问题的解（递归）（记录：动态规划）
    递归最重要的两个部分就是边界范围和递归体！这里的边界范围就是n==1的时候
     */
    //汉诺塔问题（递归必学）
    //抽象出来算法：ABC三个柱子
    // 1）（1 ～ n-1）盘 从 A 通过 C 移动到 B
    // 2） n盘          从 A        移动到 C
    // 3）（1 ～ n-1）盘 从 B 通过 A 移动到 C
    public static void main(String[] args){
        //此方法作为入门理解，真正的Hanoi看Hanoi02
        hanoi(3);
    }

    public static void hanoi(int n){
        leftToRight(n);
    }

    // 把1～N的圆盘从左移动到右
    public static void leftToRight(int n){
        if(n == 1){
            System.out.println("Move 1 from left to right");
            return;
        }
        leftToMid(n - 1);
        System.out.println("Move" + n + " from left to right");
        midToRight(n - 1);
    }

    // 把1～N从左移动到中间（腾路）
    public static void leftToMid(int n){
        if (n == 1){
            System.out.println("Move" + n + " from left to mid");
            return;
        }
        leftToRight(n - 1);
        System.out.println("Move" + n + " from left to mid");
        rightToMid(n-1);
    }

    public static void rightToMid(int n){
        if(n == 1){
            System.out.println("Move" + n + " from right to mid");
            return;
        }
        rightToLeft(n-1);
        System.out.println("Move" + n + " from right to mid");
        leftToMid(n-1);
    }

    public static void midToRight(int n){
        if(n == 1){
            System.out.println("Move" + n + " from mid to right");
            return;
        }
        midToLeft(n-1);
        System.out.println("Move" + n + " from mid to right");
        leftToRight(n-1);
    }
    public static void midToLeft(int n){
        if(n == 1){
            System.out.println("Move" + n + " from mid to left");
            return;
        }
        midToRight(n-1);
        System.out.println("Move" + n + " from mid to left");
        rightToLeft(n-1);
    }

    public static void rightToLeft(int n){
        if(n == 1){
            System.out.println("Move" + n + " from right to left");
            return;
        }
        rightToMid(n-1);
        System.out.println("Move" + n + " from right to left");
        rightToMid(n-1);
    }



}

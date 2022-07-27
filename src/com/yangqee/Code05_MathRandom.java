package com.yangqee;

/**
 * @author yangqee
 * @date 2022/7/15 2:55 下午
 */
public class Code05_MathRandom {
    //返回[0,1)范围上数出现频率从常规的x调整为x^2
    public static double xToPower2(){
        return Math.max(Math.random(), Math.random());
    }

    //返回[0,1)范围上数出现频率从常规的x调整为x^3
    public static double xToPower3(){
        return Math.max(Math.random(), Math.max(Math.random(), Math.random()));
    }
    public static void main(String[] args){
        int count = 0;
        double x = 0.7;
        int testTimes = 2000;
        for(int i = 0; i < testTimes; i++){
            if(xToPower2() < x){
                count++;
            }
        }
        System.out.println((double)count/(double) testTimes);
    }
    //
}

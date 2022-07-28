package DataStructure;

/**
 * @author yangqee
 * @date 2022/6/20 1:10 上午
 */

/**
 * algorithm
 * 1) Have a specific problem
 * 2) Have a specific process to solving the problem
 * 3) Have quantifiable indicators to evaluate the process
 *
 * algorithm classification
 * 1) Exactly know how to calculate the problem
 * 2) Exactly know how to try
 */
public class Code03_01_Algorithm {
    //1.input:n    output: 1!+2!+3!+....+n!
    //2methods:f1/f2
    public static long factorial(int n){
        long ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= i;
        }
        return ans;
    }

    public static long f1(int n){
        long ans = 0;
        for(int i = 1; i <= n; i++){
            ans += factorial(i);
        }
        return ans;
    }

    public static long f2(int n){
        long ans = 0;
        long cur = 1;
        for(int i = 1; i <= n; i++){
            cur = cur * i;
            ans += cur;
        }
        return ans;
    }

    public static void main(String[] args){
        int n = 10;
        System.out.println(f1(n));
        System.out.println(f2(n));
    }

}

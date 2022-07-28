package DataStructure;

/**
 * @author yangqee
 * @date 2022/6/30 5:48 下午
 */
public class Code04_01_DataStructure_MathRandom {
    /*DataStructure
    1.Continuous structure
    2.Jumping structure
     */
    private int[] preSum;

    public void sumArray(int[] array){
        int N = array.length;
        preSum = new int [N];
        preSum[0] = array[0];
        for(int i = 1; i < N; i++){
            preSum[i] = preSum[i - 1] + array[i];
        }
    }

    public int test(int L, int R){
        return L == 0? preSum[R]:preSum[R] - preSum[L - 1];
    }


    public static void main(String[] args){
        //random test
        double ans = Math.random();
        //Math.random() -> double -> [0,1)
        int count = 0;
        int[] intCount = new int[8];
        int testTime = 200000;
        for(int i = 0; i < testTime; i++){
//            if(Math.random() * 8 < 2){
//                count++;
            int test = (int) (Math.random()*8);
            intCount[test]++;
        }
//        System.out.println((double) count / (double) testTime);
        for(int i = 0; i < 8; i++){
            System.out.println(i + "出现了" + intCount[i] + "次");
        }
    }


}

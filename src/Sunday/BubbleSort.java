package Sunday;

/**
 * @author yangqee
 * @date 2022/7/24 8:21 下午
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] b={40,78,13,28,32,59,33,70,75,46,79,134,14,16,354,35,357,2423,424,563,6675,698,7,94,12,454,6767,8,678,67,86,8797,90};
        BubbleSort(b);
    }

    public static void BubbleSort(int[] A){
        int emp;
        boolean flag=true;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length-i-1;j++){
                if(A[j]>A[j+1]){
                    emp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=emp;
                    flag=false;
                }
//                System.out.println("第"+i+"趟，第"+j+"次："+Arrays.toString(A));
            }
            if(flag){
                break;
            }else{
                flag=true;
            }
//            System.out.println("第"+i+"趟完成时："+Arrays.toString(A));
        }
        for(int i = 0; i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}

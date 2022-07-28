package DataStructure;

import java.util.Arrays;

/**
 * @author yangqee
 * @date 2022/6/22 11:48 下午
 */
public class Code03_03_BubbleSort {
    //1.BubbleSort
    /*
    (0...N-1)
    [5, 2, 9, 6, 1, 0, 4, 3, 7, 8]
    Larger numbers: move backward
    [2, 5]
       [5, 9]
          [6, 9]
             [1, 9]
                 [0, 9]
                    [4, 9]
                       [3, 9]
                          [7, 9]
                             [8, 9]
     [2, 5, 6, 1, 0, 4, 3, 7, 8, 9]
     [2, 5, 6, 1, 0, 4, 3, 7, 8][9]
     (0,N-2) (N)
     */
    public static void BubbleSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        int N = arr.length;
        //0 ~ N-1
        //0 ~ N-2
        //0 ~ N-3
        //int[] arr = {5, 2, 9, 6, 1, 0, 4, 3, 7, 8};
        for (int i = N-1; i >= 0; i--){
            for(int j = 1; j <= N-1; j++){
                if(arr[j - 1] > arr[j]){
                    swap(arr, j-1, j);
                }
            }
        }
    }

    //3.InsertSort
    public static void InsertSort01(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        // 0 ~ 0 completed *****
        // 0 ~ 1 completed
        // 0 ~ 2 completed
        // 0 ~ 3 completed
        // 0 ~ N-1 completed
        int N = arr.length;
        for(int end = 1; end < N; end++){
            while (end - 1 >= 0 && arr[end - 1] > arr[end]){
                swap(arr, end-1, end);
                end--;
            }
        }
    }

    //3.InsertSort02
    public static void InsertSort02(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        // 0 ~ 0 completed *****
        // 0 ~ 1 completed
        // 0 ~ 2 completed
        // 0 ~ 3 completed
        // 0 ~ N-1 completed
        int N = arr.length;
        for(int end = 1; end < N; end++){
            for (int pre = end -1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--){
                swap(arr, pre, pre+1);
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i]^arr[j]; // a = a^b;
        arr[j] = arr[i]^arr[j]; // b = a^b;
        arr[i] = arr[i]^arr[j]; // a = a^b
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 6, 1, 0, 4, 3, 7, 8};
        Arrays.sort(arr);
        printArray(arr);
        //2.BubbleSort
        BubbleSort(arr);
        //3.InsertSort
        InsertSort01(arr);
        InsertSort02(arr);
        printArray(arr);
    }
}

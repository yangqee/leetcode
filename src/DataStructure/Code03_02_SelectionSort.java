package DataStructure;

/**
 * @author yangqee
 * @date 2022/6/22 11:48 下午
 */
public class Code03_02_SelectionSort {
    //1.SelectionSort
    /*
    [0...N-1] choose the minimum number [0][1...N-1]
     */
    public static void SelectionSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        int N = arr.length;
        //0 ~ N-1
        //1 ~ N-1
        //2 ~ N-1
        //i ~ N-1
        //int[] arr = {5, 2, 9, 6, 1, 0, 4, 3, 7, 8};
        for (int i = 0; i < arr.length-1; i++){
            int minValueIndex = i;
            for(int j = i+1; j < arr.length-1; j++){
//                if(arr[j] < arr[i]){
//                    minValue = arr[j];
//                }
                // result=(Q) ？ y : n
                minValueIndex = (arr[j] < arr[minValueIndex])? j : minValueIndex;
            }

            swap(arr, i, minValueIndex);

        }
    }
    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
//        int[] arr = null;
//        int[] arr = {};
        int[] arr = {12, 54, 7, 24, 65, 322, 75, 49, 0, 37};
        printArray(arr);
        //1.SelectionSort
        SelectionSort(arr);
        printArray(arr);
        int a = 10,b = 10;
        a = a^a;
        a = a^a;
        a = a^a;
        System.out.println(a);
        System.out.println(b);
    }
}

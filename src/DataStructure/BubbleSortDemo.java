package DataStructure;

/**
 * @author Xulun Cheng
 * @date 6/24/2022 8:17 PM
 */
public class BubbleSortDemo {
//    int[] inpu = {1, 4, 6, 2, 5, 7, 9, 10, 45, 34, 99};
    static void selectionSort2(int[] array){
        int size = array.length;
        for (int i = 0; i< size; i++){
            int minValue = array[i];
            for (int j = i+1; j< size; j++) {
                if(array[j] < array[i]){
                    minValue = array[j];
                }
//                minValue = array[j]<array[i]? j: minValue;
                swap(array, i, minValue);
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i]^arr[j]; // a = a^b;
        arr[j] = arr[i]^arr[j]; // b = a^b;
        arr[i] = arr[i]^arr[j]; // a = a^b
    }

    public static void ArrayPrint(int[] array){
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main (String[] arg) {
        int[] inpu = {1, 4, 6, 2, 5, 7, 9, 10, 45, 34, 99};
        ArrayPrint(inpu);
        selectionSort2(inpu);
        // bubbleSort(inpu);
        ArrayPrint(inpu);
    }
}

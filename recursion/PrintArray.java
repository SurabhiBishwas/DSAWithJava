package recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr={5,9,5,120,12};
        printArray(arr, 0);
    }

    static void printArray(int[] arr, int idx) {
        if(idx==arr.length) {
            return;
        }
        System.out.println(arr[idx]); 
        printArray(arr, idx+1);
    }

    static void printArrayReverse(int[] arr, int idx) {
        if(idx==arr.length) {
            return;
        }
        printArrayReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}

package recursion;
import java.util.Arrays;

public class MaxAndMinOfArray {
    public static void main(String[] args) {
        int[] arr={8,3,11,4,220,47,39,2};
        System.out.print(maxOfArray(arr));
    }

    static int maxOfArray(int[] arr) {
        if(arr.length==1) {
            return arr[arr.length-1];
        }
        int first=arr[0];
        int second=maxOfArray(Arrays.copyOfRange(arr, 1, arr.length));
        return Math.max(first,second);
    }

    static int minOfArray(int[] arr) {
        if(arr.length==1) {
            return arr[arr.length-1];
        }
        int first=arr[0];
        int second=minOfArray(Arrays.copyOfRange(arr, 1, arr.length));
        return Math.min(first,second);
    }
}

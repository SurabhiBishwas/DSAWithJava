package recursion;

import java.util.Arrays;

public class ValidateArrSort {
    public static void main(String[] args) {
        int[] arr={32,74,221,8745};
        System.out.println(validateArrSort(arr));
    }

    static boolean validateArrSort(int[] arr) {
        if(arr.length==0 || arr.length==1) {
            return true;
        }
        int num=arr[arr.length-1];
        arr=Arrays.copyOf(arr, arr.length-1);
        return (validateArrSort(arr) &&(arr[arr.length-1])<num);
    }
}
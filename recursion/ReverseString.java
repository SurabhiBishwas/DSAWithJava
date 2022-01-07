package recursion;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        
        String str="Recursion";
        char[] arr=str.toCharArray();
        reverseStrRecursive(arr);
        System.out.println(newStr);
    }

    static String newStr="";
    static void reverseStrRecursive(char[] arr) {
        if(arr.length==0) {
            return;
        }
        newStr=newStr+arr[arr.length-1];
        arr=Arrays.copyOf(arr, arr.length-1);
        reverseStrRecursive(arr);
    }
}

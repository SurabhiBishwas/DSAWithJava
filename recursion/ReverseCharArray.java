package recursion;
//import java.util.Arrays;

public class ReverseCharArray {
    public static void main(String[] args) {
        
        String str="Recursion";
        char[] arr=str.toCharArray();
        reverseStrRecursive(arr);
        System.out.println(arr);
    }

    static String newStr="";
    static void reverseStrRecursive(char[] arr) {
        int j=arr.length-1;
        for(int i=0;i<j;i++) {
            char temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
        }
        // if(arr.length==0) {
        //     return;
        // }
        // newStr=newStr+arr[arr.length-1];
        // arr=Arrays.copyOf(arr, arr.length-1);
        // reverseStrRecursive(arr);
    }
}

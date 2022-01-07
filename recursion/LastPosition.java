package recursion;

import java.util.Arrays;

public class LastPosition {
    public static void main(String[] args) {
        int[] arr={8,32,74,8,23,74,221,8,8745};
        System.out.println("Last Position is : "+lastPosition(arr, 74));
        System.out.print("All Position are : ");
        allPosition(arr, 74);
        System.out.println();
        System.out.println(lastPosition(arr, 74, 0));
    }

    static int lastPosition(int[] arr,int target, int idx) {
        if(idx==arr.length) {
            return -1;
        }
        int lastPos=lastPosition(arr, target, idx+1);
        if(lastPos==-1) {
            if(arr[idx]==target) {
                return idx;
            }
            return -1;
        }
        return lastPos;
    }

    static int lastPosition(int[] arr, int target) {
        if(arr.length==0) {
            return -1;
        }
        if(arr[arr.length-1]==target) {
            return arr.length-1;
        }
        arr=Arrays.copyOf(arr, arr.length-1);
        return lastPosition(arr, target);
    }

    static void allPosition(int[] arr, int target) {
        if(arr.length==0) {
            return;
        }
        if(arr[arr.length-1]==target) {
            System.out.print(arr.length-1+" ");
        }
        arr=Arrays.copyOf(arr, arr.length-1);
        allPosition(arr, target);
    }
}

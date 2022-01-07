package recursion;

public class FirstPosition {
    public static void main(String[] args) {
        int[] arr={2,55,3,7,5,7,7,12};
        allPosition(arr, 7, 0);
    }
    static void firstPosition(int[] arr,int target, int idx) {
        if(arr.length==idx) {
            System.out.println(-1);
            return;
        }
        if(arr[idx]==target) {
            System.out.println(idx);
            return;
        }
        firstPosition(arr, target, idx+1);
    }

    static void allPosition(int[] arr,int target, int idx) {
        if(arr.length==idx) {
            System.out.println(-1);
            return;
        }
        if(arr[idx]==target) {
            System.out.println(idx);
        }
        allPosition(arr, target, idx+1);
    }
}

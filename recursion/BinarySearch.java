package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={4,9,11,87,98,102,149};
        System.out.println(binarySearch(arr,0,arr.length-1));
    }

    static int target=11;
    static int binarySearch(int[] arr,int start, int end) {
        if(start>end) {
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==target) {
            return mid;
        }
        else if(arr[mid]>target) {
            end=mid-1;
        }
        else if(arr[mid]<target) {
            start=mid+1;
        }
        return binarySearch(arr, start, end);
    }
}

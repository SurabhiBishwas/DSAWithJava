package recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={4,6,7,0,1,2,3};
        System.out.println(rotatedBinarySearch(arr, 0, arr.length-1));
    }

    static int target=2;
    static int rotatedBinarySearch(int[] arr, int start, int end) {
        if(start>end) {
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==target) {
            return mid;
        }
        if(arr[start]<=arr[mid]) {
            if(target>=arr[start] && target<=arr[mid]) {
                return rotatedBinarySearch(arr, start, mid-1);
            }
            else {
                return rotatedBinarySearch(arr, mid+1, end);
            }
        }
        if(target>=arr[mid] && target<=arr[end]) {
            return rotatedBinarySearch(arr, mid+1, end);
        }
        return rotatedBinarySearch(arr, start, mid-1);
    }
}

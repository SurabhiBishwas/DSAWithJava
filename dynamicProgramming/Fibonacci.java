package dynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print(fib(10, new int[11]));
    }

    // normal recursive method
    static int fib(int n) {
        if(n==0 || n==1) {
            return n;
        }
        return (fib(n-1)+fib(n-2));
    }

    // dynamic programming method (Memoization)
    static int fib(int n, int[] arr) {
        if(n==0 || n==1) {
            return n;
        }
        if(arr[n]!=0) {
            return arr[n];
        }
        int fibn= (fib(n-1, arr)+fib(n-2, arr));
        arr[n]=fibn;
        return fibn;
    }

    
}

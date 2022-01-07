package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("By Recurion : " +sumOfDigitsRecursive(8412746));
        System.out.println("By Iteration : " +sumOfDigitsIterative(8412746));
    }

    // Recursive Method
    static int sumOfDigitsRecursive(int n) {
        if(n==0) {
            return 0;
        }
        return(sumOfDigitsRecursive(n/10)+n%10);
    }

    // Iterative Method
    static int sumOfDigitsIterative(int n) {
        int sum=0;
        while(n>0) {
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
}


package recursion;

public class CountZero {
    public static void main(String[] args) {
        countZeroRecursive(304025000);
        System.out.println("By Recurion : " +count);
        System.out.println("By Iteration : " +countZeroIterative(304025000));
    }

    static int count=0;
    static void countZeroRecursive(int n) {
        if(n==0) {
            return;
        }
        if(n%10==0) {
            count++;
        }
        countZeroRecursive(n/10);
    }

    static int countZeroIterative(int n) {
        int count=0;
        while(n>0) {
            if(n%10==0) {
                count++;
            }
            n=n/10;
        }
        return count;
    }
}



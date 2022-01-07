package recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumRecusrion(1999999999L);
        System.out.println("By Recurion : " +revNum);
        reverseNumRecusrion(541225214L);
        System.out.println("By Recurion : " +revNum);
        System.out.println("By Iteration : " +reverseNumIteration(1999999999L));        
    }

    // Recursive Method
    static long revNum=0;
    static void reverseNumRecusrion(long n, long... arr) {
        if(arr.length==0) {
            revNum=0;
        }
        else {
            revNum=arr[0];
        }
        if(n==0) {
            return;
        }
        revNum=(revNum*10)+n%10;
        reverseNumRecusrion((n/10),revNum);
    }

    // Iterative Method
    static long reverseNumIteration(long n) {
        long revNum=0;
        while(n>0) {
            revNum=(revNum*10)+(n%10);
            n=n/10;
        }
        return revNum;
    }
}

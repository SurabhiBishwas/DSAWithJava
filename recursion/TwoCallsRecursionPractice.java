package recursion;

public class TwoCallsRecursionPractice {
    public static void main(String[] args) {
        // Firstly, try to guess the answer by Stack or Euler Path representation.
        puzzle(3);
    }

    static void puzzle(int n) {
        if(n==0) {
            return;
        }
        System.out.println("Pre "+n);
        puzzle(n-1);
        System.out.println("In "+n);
        puzzle(n-1);
        System.out.println("Post "+n);
    }
}
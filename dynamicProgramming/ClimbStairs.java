package dynamicProgramming;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(countPaths(2));
    }

    static int countPaths(int n) {
        if(n==0) {
            return 1;
        }
        else if(n<0) {
            return 0;
        }
        int paths=countPaths(n-1) + countPaths(n-2) + countPaths(n-3);
        return paths;
    }
}

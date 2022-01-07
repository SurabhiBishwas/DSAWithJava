package recursion;

public class LinearPower {
    public static void main(String[] args) {
        System.out.println(linearPower(5,4));
    }

    static int linearPower(int n, int p) {
        if(p==0) {
            return 1;
        }
        return n*linearPower(n, p-1);
    }
}
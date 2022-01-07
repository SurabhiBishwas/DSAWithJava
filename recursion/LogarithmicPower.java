package recursion;

public class LogarithmicPower {
    public static void main(String[] args) {
        System.out.println(logarithmicPower(2,5));
    }

    static int logarithmicPower(int n, int p) {
        if(p==0) {
            return 1;
        }
        int ans=logarithmicPower(n, p/2);
        ans*=ans;
        if(p%2!=0) {
            return(ans*n);
        }
        return ans;
    }
}

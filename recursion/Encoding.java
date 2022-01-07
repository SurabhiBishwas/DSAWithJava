package recursion;

public class Encoding {
    public static void main(String[] args) {
        encoding("103", "");
    }

    static char[] arr={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static void encoding(String str, String ans) {
        if(str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        char c=str.charAt(0);
        if(Character.getNumericValue(c)>0) {
            c=arr[Character.getNumericValue(c)-1];
            encoding(str.substring(1), ans+c);
        }
        if(str.length()>1 && Integer.parseInt(str.substring(0, 2))<26) {
            c=arr[Integer.parseInt(str.substring(0, 2))-1];
            encoding(str.substring(2), ans+c);
        }
    }
}

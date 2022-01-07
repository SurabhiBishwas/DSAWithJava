package recursion;

public class RemoveAStringFromString {
    public static void main(String[] args) {
        System.out.println(removeAStringFromString("","sfavgappleas"));
    }

    static String removeAStringFromString(String str) {
        if(str.length()==0) {
            return "";
        }
        if(!str.startsWith("apple")) {
            return (str.charAt(0)+removeAStringFromString(str.substring(1)));
        }
        return removeAStringFromString(str.substring(5));
    }

    static String removeAStringFromString(String ans, String str) {
        if(str.length()==0) {
            return ans;
        }
        if(!str.startsWith("apple")) {
            ans=ans+str.charAt(0);
            return (removeAStringFromString(ans,str.substring(1)));
        }
        return removeAStringFromString(ans,str.substring(5));
    }
}

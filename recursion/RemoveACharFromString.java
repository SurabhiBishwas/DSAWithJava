package recursion;

public class RemoveACharFromString {
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(str);
        removeACharFromString("",str);
        //System.out.println(ans);
    }

    
    static StringBuilder ans=new StringBuilder();
    static void removeACharFromString(String str) {
        if(str.length()==0) {
            return;
        }
        if(str.charAt(0)!='l') {
            ans.append(str.charAt(0));
        }
        str=str.substring(1);
        removeACharFromString(str);
    }

    static String removeACharFromStringReturn(String str) {
        if(str.length()==0) {
            return str;
        }
        if(str.charAt(0)!='l') {
            return (str.charAt(0)+""+(removeACharFromStringReturn(str.substring(1))));
        }
        return (removeACharFromStringReturn(str.substring(1)));
    }

    static void removeACharFromString(String ans, String str) {
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }
        if(str.charAt(0)!='l') {
            ans=ans+""+str.charAt(0);
        }
        removeACharFromString(ans,str.substring(1));
    }

    static String removeACharFromStringReturn(String ans, String str) {
        if(str.length()==0) {
            return ans;
        }
        if(str.charAt(0)!='l') {
            ans=ans+""+str.charAt(0);
        }
        return (removeACharFromStringReturn(ans,str.substring(1)));
    }
}

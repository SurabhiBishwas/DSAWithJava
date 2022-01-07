package recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permutations("abc"));
        permutations("abc", "");
    }

    static void permutations(String str, String ans) {
        if(str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++) {
            permutations(str.replaceAll(String.valueOf(str.charAt(i)), ""), ans+str.charAt(i));
        }
    }

    static ArrayList<String> permutations(String str) {
        if(str.isEmpty()) {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            ArrayList<String> temp=permutations(str.replaceAll(String.valueOf(ch), ""));
            for (String string : temp) {
                ans.add(ch+string);
            }
        }
        return ans;
    }
}

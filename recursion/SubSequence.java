package recursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> arr=subSequence(str);
        System.out.println(arr);
        subSequence(str, "");
    }

    static ArrayList<String> subSequence(String str) {
        if(str.isEmpty()) {
            ArrayList<String> base=new ArrayList<String>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        ArrayList<String> temp=subSequence(str.substring(1));
        ArrayList<String> res=new ArrayList<String>();
        for(int i=0;i<temp.size();i++) {
            //res.add(temp.get(i));
            res.add(ch+temp.get(i));
        }
        res.addAll(temp);
        return res;
    }
    static void subSequence(String str, String ans) {
        if(str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        char ch=str.charAt(0);
        subSequence(str.substring(1), ans+ch);
        subSequence(str.substring(1), ans+"");
    }
}

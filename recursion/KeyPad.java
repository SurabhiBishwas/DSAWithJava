package recursion;

import java.util.ArrayList;

public class KeyPad {
    public static void main(String[] args) {
        System.out.println(keyPad("237"));
        keyPad("237","");
    }

    static String[] keyPad={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    static ArrayList<String> keyPad(String str) {
        if(str.length()==1) {
            ArrayList<String> base=new ArrayList<String>();
            String temp=keyPad[Integer.parseInt(str)];
            for(int i=0;i<temp.length();i++) {
                base.add(String.valueOf(temp.charAt(i)));
            }
            return base;
        }
        String temp=keyPad[Character.getNumericValue(str.charAt(0))];
        ArrayList<String> help=keyPad(str.substring(1));
        ArrayList<String> res=new ArrayList<String>();
        for(int j=0;j<temp.length();j++)
            for(int i=0;i<help.size();i++)
                res.add(temp.charAt(j)+help.get(i));
        return res;
    }

    static void keyPad(String str, String ans) {
        if(str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        String fKey=keyPad[Character.getNumericValue(str.charAt(0))];
        for(int i=0;i<fKey.length();i++) {
            keyPad(str.substring(1), ans+fKey.charAt(i));
        }
    }
}

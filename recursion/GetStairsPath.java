package recursion;

import java.util.ArrayList;

public class GetStairsPath {
    public static void main(String[] args) {
        System.out.println(getStairsPath(4));
        getStairsPath(4,"");
    }

    static ArrayList<String> getStairsPath(int stair) {
        if(stair==0) {
            ArrayList<String> base=new ArrayList<String>();
            base.add("");
            return base;
        }
        if(stair<0) {
            return new ArrayList<String>();
        }
        ArrayList<String> way1=getStairsPath(stair-1);
        ArrayList<String> way2=getStairsPath(stair-2);
        ArrayList<String> way3=getStairsPath(stair-3);
        ArrayList<String> paths=new ArrayList<String>();
        for (String temp : way1) {
            paths.add(1+temp);
        }
        for (String temp : way2) {
            paths.add(2+temp);
        }
        for (String temp : way3) {
            paths.add(3+temp);
        }
        return paths;
    }

    static void getStairsPath(int stair, String ans) {
        if(stair==0) {
            System.out.print(ans+" ");
            return;
        }
        if(stair<0) {
            return;
        }
        getStairsPath(stair-1,ans+""+1);
        getStairsPath(stair-2,ans+""+2);
        getStairsPath(stair-3,ans+""+3);
    }
}

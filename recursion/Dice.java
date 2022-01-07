package recursion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(dice(4));
    }

    static ArrayList<String> dice(int target) {
        if(target==0) {
            ArrayList<String> base=new ArrayList<String>();
            base.add("");
            return base;
        }
        if(target<0) {
            return new ArrayList<String>();
        }
        ArrayList<String> temp1=dice(target-1);
        ArrayList<String> temp2=dice(target-2);
        ArrayList<String> temp3=dice(target-3);
        ArrayList<String> temp4=dice(target-4);
        ArrayList<String> arr=new ArrayList<String>();
        for (String element : temp1) {
            arr.add(1+element);
        }
        for (String element : temp2) {
            arr.add(1+element);
        }
        for (String element : temp3) {
            arr.add(1+element);
        }
        for (String element : temp4) {
            arr.add(1+element);
        }
        return arr;
    }

    static void dice(String ans, int target) {
        if(target==0) {
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++) {
            dice(ans+i, target-i);
        }
    }
}

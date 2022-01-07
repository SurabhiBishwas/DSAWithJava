package recursion;

import java.util.ArrayList;

public class MazePaths {
    public static void main(String[] args) {
        ArrayList<String> arr=mazePaths(1, 1, 3, 3);
        System.out.println(arr);
        mazePaths(1, 1, 3, 3, "");
    }

    static ArrayList<String> mazePaths(int sourceRow, int sourceCol, int destRow, int destCol) {
        if(sourceCol==destCol && sourceRow==destRow) {
            ArrayList<String> base=new ArrayList<String>();
            base.add("");
            return base;
        }
        ArrayList<String> horizontalPaths=new ArrayList<String>();
        ArrayList<String> verticalPaths=new ArrayList<String>();
        if(destCol>sourceCol) {
            horizontalPaths= mazePaths(sourceRow, sourceCol+1, destRow, destCol);
        }
        if(destRow>sourceRow) {
            verticalPaths= mazePaths(sourceRow+1, sourceCol, destRow, destCol);
        }
        ArrayList<String> totalPaths=new ArrayList<String>();
        for (String path : horizontalPaths) {
            totalPaths.add("h"+path);
        }
        for (String path : verticalPaths) {
            totalPaths.add("v"+path);
        }
        return totalPaths;
    }

    static void mazePaths(int sourceRow, int sourceCol, int destRow, int destCol, String ans) {
        if(sourceCol==destCol && sourceRow==destRow){
            System.out.print(ans+" ");
            return;
        }
        if(destCol>sourceCol){
            mazePaths(sourceRow, sourceCol+1, destRow, destCol,ans+"h");
        }
        if(destRow>sourceRow){
            mazePaths(sourceRow+1, sourceCol, destRow, destCol,ans+"v");
        }
    }
}

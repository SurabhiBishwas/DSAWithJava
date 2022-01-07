package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }

    static void towerOfHanoi(int disk, char source, char aux, char target) {
        if(disk==1) {
            System.out.println(disk+" : "+source+" -> "+target);
            return;
        }
        towerOfHanoi(disk-1, source, target, aux);
        System.out.println(disk+" : "+source+" -> "+target);
        towerOfHanoi(disk-1, aux, source, target);
    }
}

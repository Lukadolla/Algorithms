public class TowerOfHanoi {

    public static void towerOfHanoi(int disk, String source, String dest, String auxiliary)
    {
        if(disk == 1)
        {
            System.out.println(source + " to " + dest);
        }

        else
        {
            towerOfHanoi(disk-1, source, auxiliary, dest);
            System.out.println(source + " to " + dest);
            towerOfHanoi(disk-1, auxiliary, dest, source);
        }
    }

    public static void main(String[] args) {
        towerOfHanoi(3, "A", "C", "B");
    }
}

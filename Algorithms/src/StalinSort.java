import java.util.LinkedList;

public class StalinSort {

    public static void StalinSort(LinkedList<Integer> arr)
    {
        int size = arr.size()-1;
        int z = 0;
        int x = 0;

       while(x < size)
        {
            if(arr.get(z) > arr.get(x+1))
            {
                arr.remove(x+1);
                size--;
            }

            else
            {
                z++;
                x++;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<Integer>() ;

        arr.add(30);
        arr.add(-30);
        arr.add(-20);
        arr.add(-10);
        arr.add(40);
        arr.add(0);
        arr.add(10);
        arr.add(15);

        StalinSort(arr);

        System.out.print(arr);
    }
}

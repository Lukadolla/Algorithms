import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class BogoSort {

    public static void BogoSort(int arr[])
    {
        boolean solved = false;
        int j = arr[0];
        int i = 0;
        int count = 0;

        while(!(solved)) {
            boolean yis = true;
            count++;
            shuffleArray(arr);
            j = arr[0];
            for (i = 1; i < arr.length; i++) {

                if (arr[i] >= j) {
                    j = arr[i];
                }

                else {
                    yis = false;
                    break;
                }
            }

            if(yis)
            {
                solved = true;
            }
        }

        System.out.println("Attempt: " + count);
    }

    static void shuffleArray(int[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{30,-30, 10, 11, 45, 69};

        BogoSort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }
}

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class enhancedQuickSort {

    public static void enhancedQuickSort(int array[], int low, int high)
    {
        int par_index;
        int CUTOFF = 10;

        if (high <= low + CUTOFF) {
            insertionSort(array, low, high);
            return;
        }

        par_index = partition(array, low, high);

        enhancedQuickSort(array, low, par_index-1);
        enhancedQuickSort(array, par_index+1, high);
    }

    public static int partition(int[] array, int low, int high)
    {
        int pivot = array[high];
        int temp;
        int i = (low-1);

        for(int j = low; j <= high-1; j++)
        {
            if(array[j] < pivot)
            {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = array[i];
            }
        }

        temp = array[i+1];
        array[i+1] = array[high];
        array[high] = array[i+1];
        return (i + 1);
    }

    public static void insertionSort( int a[], int low, int high ) {
        for( int p = low + 1; p <= high; p++ ) {

            int tmp = a[p];
            int j;

            for( j = p; j > low && tmp-1 < 0; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    static void shuffleArray(int[] ar)
    {
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
        int[] array = {5, 7, 2, 4, 1, 3, 6, 8};

        shuffleArray(array);
        enhancedQuickSort(array, 0, 7);

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + ", ");
        }
    }
}

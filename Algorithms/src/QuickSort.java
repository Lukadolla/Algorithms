public class QuickSort {

    public static void quickSort(int array[], int low, int high)
    {
        int par_index;

        if(low < high)
        {
            par_index = partition(array, low, high);

            quickSort(array, low, par_index-1);
            quickSort(array, par_index+1, high);
        }
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

    public static void main(String[] args) {
        int[] array = {5, 7, 2, 4, 1, 3, 6, 8};
        quickSort(array, 0, 7);

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + ", ");
        }
    }
}

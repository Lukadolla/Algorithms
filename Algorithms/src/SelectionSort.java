public class SelectionSort {

    public static void selectionSort(int arr[])
    {
        int temp;
        int min_index;

        for(int i = 0; i < (arr.length - 1); i++)
        {
            min_index = i;

            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[min_index] > arr[j])
                {
                    min_index = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{30,-30,-20,-10,40,0,10,15};

        selectionSort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }
}

public class InsertionSort {

    public static void InsertionSort(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j-1;
                arr[j + 1] = key;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{30,-30,-20,-10,40,0,10,15};

        InsertionSort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }
}

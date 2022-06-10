public class MergeSort {

    public static void mergeSort(int[] array, int size) {
        if (size == 1) {
            return;
        }

        int mid = size / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int j = mid; j < size; j++) {
            right[j - mid] = array[j];
        }

        mergeSort(left, mid);
        mergeSort(right, size - mid);

        merge(array, left, right, mid, size - mid);

    }

    public static void merge(int[] array, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k++] = l[i++];
            } else {
                array[k++] = r[j++];
            }
        }

        while (i < left) {
            array[k++] = l[i++];
        }

        while (j < right) {
            array[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 2, 4, 1, 3, 6, 8};
        mergeSort(array, 8);

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + ", ");
        }

    }
}


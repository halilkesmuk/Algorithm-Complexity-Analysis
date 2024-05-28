public class SortAlgorithms
{
    public static void insertionSort(int[] A)
    {
        for (int j = 1; j < A.length; j++)
        {
            int key = A[j];
            int i = j - 1;

            while (i >= 0 && A[i] > key)
            {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
    }


    public static int[] mergeSort(int[] array)
    {
        if (array == null || array.length <= 1) {
            return array;
        }

        // Break the array in two halves
        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        System.arraycopy(array, 0, leftArray, 0, mid);

        if (array.length - mid >= 0)
            System.arraycopy(array, mid, rightArray,
                    0, array.length - mid);

        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);
        return merge(leftArray, rightArray, array);
    }

    public static int[] merge(int[] leftArray, int[] rightArray, int[] array){
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }

        return  array;
    }



    public static int[] countingSort(int[] inputArray, int N) {

        int M = 0;

        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }

        int[] countArray = new int[M + 1];

        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }

        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outputArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }

        return outputArray;
    }
}
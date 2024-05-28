import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {

        // 10 arrays were created
        int[] arr1 = new int[500];
        int[] arr2 = new int[1000];
        int[] arr3 = new int[2000];
        int[] arr4 = new int[4000];
        int[] arr5 = new int[8000];
        int[] arr6 = new int[16000];
        int[] arr7 = new int[32000];
        int[] arr8 = new int[64000];
        int[] arr9 = new int[128000];
        int[] arr10 = new int[250000];


        // The file of Traffic Flow was read

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line = br.readLine();

        int temp = 0;
        // This i veriable up to 250,000. Because size of the largest array which we use is 250,000

        while((line = br.readLine()) != null && temp < 250000){
            // The file was separated by comma , it's ".csv" file

            String[] datas = line.split(",");

            // These if blocks allow to add as many elements to each array as its size

            if(temp<500){
                arr1[temp] = Integer.parseInt(datas[6]);
            }
            if(temp<1000){
                arr2[temp] = Integer.parseInt(datas[6]);
            }
            if(temp<2000){
                arr3[temp] = Integer.parseInt(datas[6]);
            }
            if(temp<4000){
                arr4[temp] = Integer.parseInt(datas[6]);
            }
            if(temp<8000){
                arr5[temp] = Integer.parseInt(datas[6]);
            }if(temp<16000){
                arr6[temp] = Integer.parseInt(datas[6]);
            }
            if(temp<32000){
                arr7[temp] = Integer.parseInt(datas[6]);
            }if(temp<64000){
                arr8[temp] = Integer.parseInt(datas[6]);
            }
            if(temp<128000){
                arr9[temp] = Integer.parseInt(datas[6]);
            }
            // as it was said, i up to 250k, so it's not necessary any if block for arr10
            arr10[temp] = Integer.parseInt(datas[6]);
            temp++;
        }
        br.close();

        // File reading and adding to arrays are done.
        // Now the graphics should be drawn.
        // Firstly, the time should be kept


        SortAlgorithms sortAlgo = new SortAlgorithms();
        SortingAlgorithmTester test = new SortingAlgorithmTester();

       // Testing with random data

        // insertion sort part
        double[] insertionSortTimesRandom = new double[10];
        insertionSortTimesRandom = test.TimeKeeperIS(arr1.clone(),arr2.clone(),arr3.clone(),arr4.clone(),arr5.clone(),
                arr6.clone(),arr7.clone(),arr8.clone(),arr9.clone(),arr10.clone(),insertionSortTimesRandom);

        // merge sort part
        double[] mergeSortTimesRandom = new double[10];
        mergeSortTimesRandom = test.TimeKeeperMS(arr1.clone(),arr2.clone(),arr3.clone(),arr4.clone(),arr5.clone()
                ,arr6.clone(),arr7.clone(),arr8.clone(),arr9.clone(),arr10.clone(),mergeSortTimesRandom);

        // counting sort part
        double[] countingSortTimesRandom = new double[10];
        countingSortTimesRandom = test.TimeKeeperCS(arr1.clone(),arr2.clone(),arr3.clone(),arr4.clone(),arr5.clone(),
                arr6.clone(),arr7.clone(),arr8.clone(),arr9.clone(),arr10.clone(),countingSortTimesRandom);



        // Testing with sorted data

        int[] sortedArr1,sortedArr2,sortedArr3,sortedArr4,sortedArr5,sortedArr6,sortedArr7,sortedArr8,sortedArr9,sortedArr10;

        sortedArr1 = arr1.clone();
        Arrays.sort(sortedArr1);

        sortedArr2 = arr2.clone();
        Arrays.sort(sortedArr2);

        sortedArr3 = arr3.clone();
        Arrays.sort(sortedArr3);

        sortedArr4 = arr4.clone();
        Arrays.sort(sortedArr4);

        sortedArr5 = arr5.clone();
        Arrays.sort(sortedArr5);

        sortedArr6 = arr6.clone();
        Arrays.sort(sortedArr6);

        sortedArr7 = arr7.clone();
        Arrays.sort(sortedArr7);

        sortedArr8 = arr8.clone();
        Arrays.sort(sortedArr8);

        sortedArr9 = arr9.clone();
        Arrays.sort(sortedArr9);

        sortedArr10 = arr10.clone();
        Arrays.sort(sortedArr10);


        // insertion sort part
        double[] insertionSortTimesSorted = new double[10];
        insertionSortTimesSorted = test.TimeKeeperIS(sortedArr1,sortedArr2,sortedArr3,sortedArr4,sortedArr5,sortedArr6,sortedArr7,
                sortedArr8,sortedArr9,sortedArr10,insertionSortTimesSorted);

        // merge sort part
        double[] mergeSortTimesSorted = new double[10];
        mergeSortTimesSorted = test.TimeKeeperMS(sortedArr1,sortedArr2,sortedArr3,sortedArr4,sortedArr5,sortedArr6,
                sortedArr7,sortedArr8,sortedArr9,sortedArr10,mergeSortTimesSorted);

        // counting sort part
        double[] countingSortTimesSorted = new double[10];
        countingSortTimesSorted = test.TimeKeeperCS(sortedArr1,sortedArr2,sortedArr3,sortedArr4,sortedArr5,sortedArr6,sortedArr7,
                sortedArr8,sortedArr9,sortedArr10,countingSortTimesSorted);


        // Testing with reverse data
        // My arrays already sorted, then just reverse. By using method which in SortAlgorithmTester

        SortingAlgorithmTester reverse = new SortingAlgorithmTester();
        int[] reverseArr1,reverseArr2,reverseArr3,reverseArr4,reverseArr5,reverseArr6,reverseArr7,reverseArr8,
                reverseArr9,reverseArr10;
        reverseArr1 = reverse.reverser(sortedArr1);
        reverseArr2 = reverse.reverser(sortedArr2);
        reverseArr3 = reverse.reverser(sortedArr3);
        reverseArr4 = reverse.reverser(sortedArr4);
        reverseArr5 = reverse.reverser(sortedArr5);
        reverseArr6 = reverse.reverser(sortedArr6);
        reverseArr7 = reverse.reverser(sortedArr7);
        reverseArr8 = reverse.reverser(sortedArr8);
        reverseArr9 = reverse.reverser(sortedArr9);
        reverseArr10 = reverse.reverser(sortedArr10);

        // insertion sort part
        double[] insertionSortTimesReversed = new double[10];
        insertionSortTimesReversed = test.TimeKeeperIS(reverseArr1,reverseArr2,reverseArr3,reverseArr4,reverseArr5,
                reverseArr6,reverseArr7,reverseArr8,reverseArr9,reverseArr10,insertionSortTimesReversed);

        // merge sort part
        double[] mergeSortTimesReversed = new double[10];
        mergeSortTimesReversed = test.TimeKeeperMS(reverseArr1,reverseArr2,reverseArr3,reverseArr4,reverseArr5,
                reverseArr6,reverseArr7,reverseArr8,reverseArr9,reverseArr10,mergeSortTimesReversed);

        // counting sort part
        double[] countingSortTimesReversed = new double[10];
        countingSortTimesReversed = test.TimeKeeperCS(reverseArr1,reverseArr2,reverseArr3,reverseArr4,reverseArr5,
                reverseArr6,reverseArr7,reverseArr8,reverseArr9,reverseArr10,countingSortTimesReversed);



        // SEARCHING PART

        SearchingAlgorithmTester testSearch = new SearchingAlgorithmTester();

        double[] linearRandomTimes = new double[10];
        double[] linearSortedTimes = new double[10];
        double[] binarySortedTimes = new double[10];

        linearRandomTimes = testSearch.timeKeeperLineerSearching(arr1,arr2,arr3,arr4,arr5,arr6,arr7,arr8,arr9,arr10,linearRandomTimes);
        linearSortedTimes = testSearch.timeKeeperLineerSearching(sortedArr1,sortedArr2,sortedArr3,sortedArr4,sortedArr5,sortedArr6,
                sortedArr7,sortedArr8,sortedArr9,sortedArr10,linearSortedTimes);
        binarySortedTimes = testSearch.timeKeeperBinarySearching(sortedArr1,sortedArr2,sortedArr3,sortedArr4,sortedArr5,sortedArr6,
                sortedArr7,sortedArr8,sortedArr9,sortedArr10,binarySortedTimes);


        System.out.println("insertion random:");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+insertionSortTimesRandom[i]+", ");
        }
        System.out.println();
        System.out.println("insertion sorted:");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+insertionSortTimesSorted[i]+", ");
        }
        System.out.println();
        System.out.println("insertion reverse:");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+insertionSortTimesReversed[i]+", ");
        }



        System.out.println();
        System.out.println("merge random:");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+mergeSortTimesRandom[i]+", ");
        }
        System.out.println();
        System.out.println("merge sorted:");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+mergeSortTimesSorted[i]+", ");
        }
        System.out.println();
        System.out.println("merge reversed");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+mergeSortTimesReversed[i]+", ");
        }



        System.out.println();
        System.out.println("counting random:");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+countingSortTimesRandom[i]+", ");
        }
        System.out.println();
        System.out.println("counting sorted:");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+countingSortTimesSorted[i]+", ");
        }
        System.out.println();
        System.out.println("counting reversed:");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+countingSortTimesReversed[i]+", ");
        }


        System.out.println();
        System.out.println("LinearSearch random:");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+linearRandomTimes[i]+", ");
        }
        System.out.println();
        System.out.println("LinearSearch sorted:");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+linearSortedTimes[i]+", ");
        }
        System.out.println();
        System.out.println("binarySearch sorted:");
        for(int i=0;i<10;i++){
            System.out.print(i+" = "+binarySortedTimes[i]+", ");
        }


        Chart charter = new Chart();
        int[] inputAxis = {500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 128000, 250000};

        // Sorting Part
        charter.showAndSaveChart("Random Data Test", inputAxis,insertionSortTimesRandom,mergeSortTimesRandom,countingSortTimesRandom);
        charter.showAndSaveChart("Sorted Data Test", inputAxis,insertionSortTimesSorted,mergeSortTimesSorted,countingSortTimesSorted);
        charter.showAndSaveChart("Reversed Data Test", inputAxis,insertionSortTimesReversed,mergeSortTimesReversed,countingSortTimesReversed);
        // Searching Part
        charter.showAndSaveChartSearching("Searching Test", inputAxis,linearRandomTimes,linearSortedTimes,binarySortedTimes);


    }

}

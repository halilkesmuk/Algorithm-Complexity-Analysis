public class SortingAlgorithmTester {

    public double[] TimeKeeperIS(int[] arr1,int[] arr2,int[] arr3,int[] arr4,int[] arr5,int[] arr6,int[] arr7,
                           int[] arr8,int[] arr9,int[] arr10,double[] timesList){
        SortAlgorithms sortAlgo = new SortAlgorithms();

        double totalTime1 = 0;
        double totalTime2 = 0;
        double totalTime3 = 0;
        double totalTime4 = 0;
        double totalTime5 = 0;
        double totalTime6 = 0;
        double totalTime7 = 0;
        double totalTime8 = 0;
        double totalTime9 = 0;
        double totalTime10 = 0;

        for(int i=0;i<10;i++){
            long start,end;
            int[] copiedArr;

            copiedArr = arr1.clone();
            start = System.nanoTime();
            sortAlgo.insertionSort(copiedArr);
            end = System.nanoTime();
            totalTime1 += (end - start)/1000000.0;

            copiedArr = arr2.clone();
            start = System.nanoTime();
            sortAlgo.insertionSort(copiedArr);
            end = System.nanoTime();
            totalTime2 += (end - start)/1000000.0;

            copiedArr = arr3.clone();
            start = System.nanoTime();
            sortAlgo.insertionSort(copiedArr);
            end = System.nanoTime();
            totalTime3 += (end - start)/1000000.0;

            copiedArr = arr4.clone();
            start = System.nanoTime();
            sortAlgo.insertionSort(copiedArr);
            end = System.nanoTime();
            totalTime4 += (end - start)/1000000.0;

            copiedArr = arr5.clone();
            start = System.nanoTime();
            sortAlgo.insertionSort(copiedArr);
            end = System.nanoTime();
            totalTime5 += (end - start)/1000000.0;

            copiedArr = arr6.clone();
            start = System.nanoTime();
            sortAlgo.insertionSort(copiedArr);
            end = System.nanoTime();
            totalTime6 += (end - start)/1000000.0;

            copiedArr = arr7.clone();
            start = System.nanoTime();
            sortAlgo.insertionSort(copiedArr);
            end = System.nanoTime();
            totalTime7 += (end - start)/1000000.0;

            copiedArr = arr8.clone();
            start = System.nanoTime();
            sortAlgo.insertionSort(copiedArr);
            end = System.nanoTime();
            totalTime8 += (end - start)/1000000.0;

            copiedArr = arr9.clone();
            start = System.nanoTime();
            sortAlgo.insertionSort(copiedArr);
            end = System.nanoTime();
            totalTime9 += (end - start)/1000000.0;

            copiedArr = arr10.clone();
            start = System.nanoTime();
            sortAlgo.insertionSort(copiedArr);
            end = System.nanoTime();
            totalTime10 += (end - start)/1000000.0;
        }
        timesList[0] = totalTime1/10.0;
        timesList[1] = totalTime2/10.0;
        timesList[2] = totalTime3/10.0;
        timesList[3] = totalTime4/10.0;
        timesList[4] = totalTime5/10.0;
        timesList[5] = totalTime6/10.0;
        timesList[6] = totalTime7/10.0;
        timesList[7] = totalTime8/10.0;
        timesList[8] = totalTime9/10.0;
        timesList[9] = totalTime10/10.0;

        return timesList;
        }
    public double[] TimeKeeperMS(int[] arr1,int[] arr2,int[] arr3,int[] arr4,int[] arr5,int[] arr6,int[] arr7,
                                 int[] arr8,int[] arr9,int[] arr10,double[] timesList){
        SortAlgorithms sortAlgo = new SortAlgorithms();

        double totalTime1 = 0;
        double totalTime2 = 0;
        double totalTime3 = 0;
        double totalTime4 = 0;
        double totalTime5 = 0;
        double totalTime6 = 0;
        double totalTime7 = 0;
        double totalTime8 = 0;
        double totalTime9 = 0;
        double totalTime10 = 0;

        for(int i=0;i<10;i++){
            long start,end;
            int[] copiedArr;

            copiedArr = arr1.clone();
            start = System.nanoTime();
            sortAlgo.mergeSort(copiedArr);
            end = System.nanoTime();
            totalTime1 += (end - start)/1000000.0;

            copiedArr = arr2.clone();
            start = System.nanoTime();
            sortAlgo.mergeSort(copiedArr);
            end = System.nanoTime();
            totalTime2 += (end - start)/1000000.0;

            copiedArr = arr3.clone();
            start = System.nanoTime();
            sortAlgo.mergeSort(copiedArr);
            end = System.nanoTime();
            totalTime3 += (end - start)/1000000.0;

            copiedArr = arr4.clone();
            start = System.nanoTime();
            sortAlgo.mergeSort(copiedArr);
            end = System.nanoTime();
            totalTime4 += (end - start)/1000000.0;

            copiedArr = arr5.clone();
            start = System.nanoTime();
            sortAlgo.mergeSort(copiedArr);
            end = System.nanoTime();
            totalTime5 += (end - start)/1000000.0;

            copiedArr = arr6.clone();
            start = System.nanoTime();
            sortAlgo.mergeSort(copiedArr);
            end = System.nanoTime();
            totalTime6 += (end - start)/1000000.0;

            copiedArr = arr7.clone();
            start = System.nanoTime();
            sortAlgo.mergeSort(copiedArr);
            end = System.nanoTime();
            totalTime7 += (end - start)/1000000.0;

            copiedArr = arr8.clone();
            start = System.nanoTime();
            sortAlgo.mergeSort(copiedArr);
            end = System.nanoTime();
            totalTime8 += (end - start)/1000000.0;

            copiedArr = arr9.clone();
            start = System.nanoTime();
            sortAlgo.mergeSort(copiedArr);
            end = System.nanoTime();
            totalTime9 += (end - start)/1000000.0;

            copiedArr = arr10.clone();
            start = System.nanoTime();
            sortAlgo.mergeSort(copiedArr);
            end = System.nanoTime();
            totalTime10 += (end - start)/1000000.0;
        }
        timesList[0] = totalTime1/10.0;
        timesList[1] = totalTime2/10.0;
        timesList[2] = totalTime3/10.0;
        timesList[3] = totalTime4/10.0;
        timesList[4] = totalTime5/10.0;
        timesList[5] = totalTime6/10.0;
        timesList[6] = totalTime7/10.0;
        timesList[7] = totalTime8/10.0;
        timesList[8] = totalTime9/10.0;
        timesList[9] = totalTime10/10.0;

        return timesList;
    }

    public double[] TimeKeeperCS(int[] arr1,int[] arr2,int[] arr3,int[] arr4,int[] arr5,int[] arr6,int[] arr7,
                                 int[] arr8,int[] arr9,int[] arr10,double[] timesList){
        SortAlgorithms sortAlgo = new SortAlgorithms();

        double totalTime1 = 0;
        double totalTime2 = 0;
        double totalTime3 = 0;
        double totalTime4 = 0;
        double totalTime5 = 0;
        double totalTime6 = 0;
        double totalTime7 = 0;
        double totalTime8 = 0;
        double totalTime9 = 0;
        double totalTime10 = 0;

        for(int i=0;i<10;i++){
            long start,end;
            int[] copiedArr;

            copiedArr = arr1.clone();
            start = System.nanoTime();
            sortAlgo.countingSort(copiedArr, copiedArr.length);
            end = System.nanoTime();
            totalTime1 += (end - start)/1000000.0;

            copiedArr = arr2.clone();
            start = System.nanoTime();
            sortAlgo.countingSort(copiedArr, copiedArr.length);
            end = System.nanoTime();
            totalTime2 += (end - start)/1000000.0;

            copiedArr = arr3.clone();
            start = System.nanoTime();
            sortAlgo.countingSort(copiedArr, copiedArr.length);
            end = System.nanoTime();
            totalTime3 += (end - start)/1000000.0;

            copiedArr = arr4.clone();
            start = System.nanoTime();
            sortAlgo.countingSort(copiedArr, copiedArr.length);
            end = System.nanoTime();
            totalTime4 += (end - start)/1000000.0;

            copiedArr = arr5.clone();
            start = System.nanoTime();
            sortAlgo.countingSort(copiedArr, copiedArr.length);
            end = System.nanoTime();
            totalTime5 += (end - start)/1000000.0;

            copiedArr = arr6.clone();
            start = System.nanoTime();
            sortAlgo.countingSort(copiedArr, copiedArr.length);
            end = System.nanoTime();
            totalTime6 += (end - start)/1000000.0;

            copiedArr = arr7.clone();
            start = System.nanoTime();
            sortAlgo.countingSort(copiedArr, copiedArr.length);
            end = System.nanoTime();
            totalTime7 += (end - start)/1000000.0;

            copiedArr = arr8.clone();
            start = System.nanoTime();
            sortAlgo.countingSort(copiedArr, copiedArr.length);
            end = System.nanoTime();
            totalTime8 += (end - start)/1000000.0;

            copiedArr = arr9.clone();
            start = System.nanoTime();
            sortAlgo.countingSort(copiedArr, copiedArr.length);
            end = System.nanoTime();
            totalTime9 += (end - start)/1000000.0;

            copiedArr = arr10.clone();
            start = System.nanoTime();
            sortAlgo.countingSort(copiedArr, copiedArr.length);
            end = System.nanoTime();
            totalTime10 += (end - start)/1000000.0;
        }
        timesList[0] = totalTime1/10.0;
        timesList[1] = totalTime2/10.0;
        timesList[2] = totalTime3/10.0;
        timesList[3] = totalTime4/10.0;
        timesList[4] = totalTime5/10.0;
        timesList[5] = totalTime6/10.0;
        timesList[6] = totalTime7/10.0;
        timesList[7] = totalTime8/10.0;
        timesList[8] = totalTime9/10.0;
        timesList[9] = totalTime10/10.0;

        return timesList;
    }


        int[] reverser(int[] arr){

            int[] reversedArr = new int[arr.length];
            int j = arr.length;
            for (int i = 0; i < arr.length; i++) {
                reversedArr[j - 1] = arr[i];
                j = j - 1;
            }
        return reversedArr;
        }
    }

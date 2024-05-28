import java.util.Random;

public class SearchingAlgorithmTester {



        public double[] timeKeeperLineerSearching(int[] arr1,int[] arr2,int[] arr3,int[] arr4,int[] arr5,int[] arr6,
                                            int[] arr7,int[] arr8,int[] arr9,int[] arr10,double[] timeList){

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
            int idx;
            int value;
            int x;
            SearchAlgorithms search = new SearchAlgorithms();

            for(int i=0;i<1000;i++){
                long start,end;

                idx = getRandomIndex(0,499);
                value = arr1[idx];
                start = System.nanoTime();
                x = search.LineerSearch(arr1,value);
                end = System.nanoTime();
                totalTime1 += end - start;

                idx = getRandomIndex(0,999);
                value = arr2[idx];
                start = System.nanoTime();
                x = search.LineerSearch(arr2,value);
                end = System.nanoTime();
                totalTime2 += end - start;

                idx = getRandomIndex(0,1999);
                value = arr3[idx];
                start = System.nanoTime();
                x = search.LineerSearch(arr3,value);
                end = System.nanoTime();
                totalTime3 += end - start;

                idx = getRandomIndex(0,3999);
                value = arr4[idx];
                start = System.nanoTime();
                x = search.LineerSearch(arr4,value);
                end = System.nanoTime();
                totalTime4 += end - start;

                idx = getRandomIndex(0,7999);
                value = arr5[idx];
                start = System.nanoTime();
                x = search.LineerSearch(arr5,value);
                end = System.nanoTime();
                totalTime5 += end - start;

                idx = getRandomIndex(0,15999);
                value = arr6[idx];
                start = System.nanoTime();
                x = search.LineerSearch(arr6,value);
                end = System.nanoTime();
                totalTime6 += end - start;

                idx = getRandomIndex(0,31999);
                value = arr7[idx];
                start = System.nanoTime();
                x = search.LineerSearch(arr7,value);
                end = System.nanoTime();
                totalTime7 += end - start;

                idx = getRandomIndex(0,63999);
                value = arr8[idx];
                start = System.nanoTime();
                x = search.LineerSearch(arr8,value);
                end = System.nanoTime();
                totalTime8 += end - start;

                idx = getRandomIndex(0,127999);
                value = arr9[idx];
                start = System.nanoTime();
                x = search.LineerSearch(arr9,value);
                end = System.nanoTime();
                totalTime9 += end - start;

                idx = getRandomIndex(0,249999);
                value = arr10[idx];
                start = System.nanoTime();
                x = search.LineerSearch(arr10,value);
                end = System.nanoTime();
                totalTime10 += end - start;
            }
            timeList[0] = totalTime1/1000.0;
            timeList[1] = totalTime2/1000.0;
            timeList[2] = totalTime3/1000.0;
            timeList[3] = totalTime4/1000.0;
            timeList[4] = totalTime5/1000.0;
            timeList[5] = totalTime6/1000.0;
            timeList[6] = totalTime7/1000.0;
            timeList[7] = totalTime8/1000.0;
            timeList[8] = totalTime9/1000.0;
            timeList[9] = totalTime10/1000.0;

            return timeList;
        }

    public double[] timeKeeperBinarySearching(int[] arr1,int[] arr2,int[] arr3,int[] arr4,int[] arr5,int[] arr6,
                                              int[] arr7,int[] arr8,int[] arr9,int[] arr10,double[] timeList){

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
        int idx ;
        int value;
        int x;
        SearchAlgorithms search = new SearchAlgorithms();

        for(int i=0;i<1000;i++){
            long start,end;

            idx = getRandomIndex(0,499);
            value = arr1[idx];
            start = System.nanoTime();
            x = search.BinarySearch(arr1,value);
            end = System.nanoTime();
            totalTime1 += end - start;

            idx = getRandomIndex(0,999);
            value = arr2[idx];
            start = System.nanoTime();
            x = search.BinarySearch(arr2,value);
            end = System.nanoTime();
            totalTime2 += end - start;

            idx = getRandomIndex(0,1999);
            value = arr3[idx];
            start = System.nanoTime();
            x = search.BinarySearch(arr3,value);
            end = System.nanoTime();
            totalTime3 += end - start;

            idx = getRandomIndex(0,3999);
            value = arr4[idx];
            start = System.nanoTime();
            x = search.BinarySearch(arr4,value);
            end = System.nanoTime();
            totalTime4 += end - start;

            idx = getRandomIndex(0,7999);
            value = arr5[idx];
            start = System.nanoTime();
            x = search.BinarySearch(arr5,value);
            end = System.nanoTime();
            totalTime5 += end - start;

            idx = getRandomIndex(0,15999);
            value = arr6[idx];
            start = System.nanoTime();
            x = search.BinarySearch(arr6,value);
            end = System.nanoTime();
            totalTime6 += end - start;

            idx = getRandomIndex(0,31999);
            value = arr7[idx];
            start = System.nanoTime();
            x = search.BinarySearch(arr7,value);
            end = System.nanoTime();
            totalTime7 += end - start;

            idx = getRandomIndex(0,63999);
            value = arr8[idx];
            start = System.nanoTime();
            x = search.BinarySearch(arr8,value);
            end = System.nanoTime();
            totalTime8 += end - start;

            idx = getRandomIndex(0,127999);
            value = arr9[idx];
            start = System.nanoTime();
            x = search.BinarySearch(arr9,value);
            end = System.nanoTime();
            totalTime9 += end - start;

            idx = getRandomIndex(0,249999);
            value = arr10[idx];
            start = System.nanoTime();
            x = search.BinarySearch(arr10,value);
            end = System.nanoTime();
            totalTime10 += end - start;
        }
        timeList[0] = totalTime1/1000.0;
        timeList[1] = totalTime2/1000.0;
        timeList[2] = totalTime3/1000.0;
        timeList[3] = totalTime4/1000.0;
        timeList[4] = totalTime5/1000.0;
        timeList[5] = totalTime6/1000.0;
        timeList[6] = totalTime7/1000.0;
        timeList[7] = totalTime8/1000.0;
        timeList[8] = totalTime9/1000.0;
        timeList[9] = totalTime10/1000.0;

        return timeList;
    }
    public int getRandomIndex(int min,int max){
            return (int) ((Math.random()*(max-min))+min);
    }
}

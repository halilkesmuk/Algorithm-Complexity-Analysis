public class SearchAlgorithms {
    int LineerSearch(int[] arr, int value){
        int size = arr.length;
        for(int i=0;i<=size-1;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;

    }

    int BinarySearch(int[] arr, int value){
        int low = 0;
        int high = arr.length -1 ;
        while(high-low > 1){
            int mid = (high+low)/2;
            if(arr[mid]<value){
                low = mid +1;
            }
            else{
                high = mid;
            }
        }
        if(arr[low] == value){
            return low;
        }
        else if (arr[high]==value){
            return high;
        }
        return -1;
    }
}

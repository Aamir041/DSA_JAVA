import java.util.Arrays;

public class MergeSortTut{
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 2, 4, 5, 8, 6, 6, 10};
        int low = 0;
        int high = arr.length-1;
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int low, int high){
        if(low>=high)
            return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    static void merge(int[] arr,int low, int mid, int high){
        int[] lArr = new int[mid-low+1];
        int[] rArr = new int[high-mid];

        for(int i=0; i<lArr.length; i++){
            lArr[i] = arr[low+i];
        }

        for(int i=0; i<rArr.length; i++){
            rArr[i] = arr[mid+i+1];
        }
        int i=0;
        int j=0;
        int  k = low;
        while(i<lArr.length && j<rArr.length){

            if(lArr[i] < rArr[j]){
                arr[k] = lArr[i];
                i++;
            }
            else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i<lArr.length){
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while(j<rArr.length){
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }
}
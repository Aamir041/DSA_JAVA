import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Before: "+Arrays.toString(arr));
        RevArr(arr,0);
        System.out.println("After: "+Arrays.toString(arr));
    }

    static void RevArr(int[] arr,int i){
        int n = arr.length;
        if(i>=n/2) return;
        int temp = arr[i];
        arr[i] =  arr[n-i-1];
        arr[n-i-1] = temp;
        RevArr(arr, i+1);
    }
}

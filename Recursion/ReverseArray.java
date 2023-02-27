import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {7, 5, 5, 5, 10, 10, 7, 7, 3, 0};
        System.out.println("Before: "+Arrays.toString(arr));
        RevArr(arr,0,arr.length-1);
        System.out.println("After: "+Arrays.toString(arr));
    }

    static void RevArr(int[] arr,int i,int j){
        if(i>j) return;
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
        RevArr(arr, i+1, j-1);
    }
}

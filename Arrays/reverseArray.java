import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        /*
          TODO -> make a function that reverse a Array using previously made swap function
        */
        int[] arr = {6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] array){
        int index1 = 0;
        int index2 = array.length-1;

        System.out.println(array.length/2);

        for(int i=1; i<=array.length/2; i++){
            swap(array,index1,index2);
            index1++;
            index2--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

import java.lang.reflect.Array;
import java.util.Arrays;

public class swapElement {
    public static void main(String[] args) {
        int[] array1 = {1,2,4,3};
        System.out.println(Arrays.toString(array1));
        swap(array1, 2,3);
        System.out.println(Arrays.toString(array1));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

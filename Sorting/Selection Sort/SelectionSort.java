import java.util.Arrays;

public class SelectionSort{
    
    public static void main(String[] args) {

    	int[] arr = {4,1,3,9,7};
    	System.out.println("Before: "+Arrays.toString(arr));
    	selectsort(arr);
    	System.out.println("After: "+Arrays.toString(arr));

    }

    static void selectsort(int[] arr){
    	for(int i=0; i<arr.length; i++){
    		
    		int minIndex = i;

    		for(int j = i+1; j<arr.length; j++){
    			
    			if(arr[j] < arr[minIndex]){
    				minIndex = j;
    			}
    		}

    		int swap = arr[i];
    		arr[i] = arr[minIndex];
    		arr[minIndex] = swap;
    	}
    }

}
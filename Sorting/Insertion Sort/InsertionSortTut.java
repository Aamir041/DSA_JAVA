import java.util.Arrays;

public class InsertionSortTutTut{
	
	public static void main(String[] args) {

		int[] arr = {14,9,15,12,6,8,13};

		System.out.println("Before: "+Arrays.toString(arr));
    	insertionSort(arr);
    	System.out.println("After: "+Arrays.toString(arr));

	}

	static void insertionSort(int[] arr){

		for(int i=0; i<arr.length; i++){

			for(int j=i; j>0; j--){
				
				if(arr[j-1] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}

			}

		}

	}

}
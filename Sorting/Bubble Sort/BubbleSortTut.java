import java.util.Arrays;

public class BubbleSortTut{
	
	public static void main(String[] args) {

		int[] arr = {13,46,24,52,20,9};

		System.out.println("Before: "+Arrays.toString(arr));
    	bubbleSort(arr);
    	System.out.println("After: "+Arrays.toString(arr));

	}

	static void bubbleSort(int[] arr){

		for(int i=0; i<arr.length; i++){
			
			for(int j = 0; j<arr.length - i-1; j++){

				if(arr[j] > arr[j+1]){

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 

				}

			}

		}

	}

}
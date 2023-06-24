public class simpleLinearSearch {
	public static void main(String[] args) {
		int[] arr = { 12, 56, 89, 54, 23, 44, 98, 20, 99 };

		int result1 = linearSearch(arr, 423);
		System.out.println(result1);

		boolean result2 = linearSearch2(arr, 23);
		System.out.println(result2);
	}

	// INT function returns index of element if element is present in array
	static int linearSearch(int[] array, int x) {

		// if array is empty return -1
		if (array.length == 0) {
			return -1;
		}

		// iterate over array and if target element is found return index number
		for (int index = 0; index < array.length; index++) {
			if (array[index] == x) {
				return index;
			}
		}

		// if after iterating over whole array target number is not found then return -1
		return -1;
	}


	// boolean function for linear search only returns if target is in array or not
	// using "ENHANCED for loop"
	static boolean linearSearch2(int[] array, int target) {
		// if array is empty return false
		if (array.length == 0) {
			return false;
		}

		// USING Enhanced for loop iterate over array and if target element is found returns true
		
		for(int num: array){
			if(num == target){
				return true;
			}
		}

		// if after iterating over whole array target number is not found then return false
		return false;
	}

}

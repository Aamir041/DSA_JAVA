public class descBinarySearch{
	public static void main(String[] args){
		
		int[] array = {90,75,18,12,6,4,3,1};
		int target = 1;

		System.out.println(binarySearch(array, target));
 	}

 	static int binarySearch(int[] array, int target){

 		int start = 0;
 		int end = array.length-1;
 		while(start <= end){
 			
 			int mid = start + (end - start) /2;

 			if(target > array[mid]){
 				end = mid-1;
 			}

 			else if( target < array[mid]){
 				start = mid+1;
 			}

 			else{
 				return mid;
 			}
 		}

 		return -1;

 	}
}
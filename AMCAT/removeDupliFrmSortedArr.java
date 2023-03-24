import java.util.*;

public class removeDupliFrmSortedArr{
	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,7,8,8,9,9,9,10,10};
		
		int temp = arr[0];

		ArrayList<Integer> nums = new ArrayList<>();

		for(int i=1; i<arr.length; i++){
			if(temp != arr[i]){
				nums.add(temp);
			}
			temp= arr[i];
		}
		if(nums.get(nums.size()-1) != arr[arr.length-1]){
				nums.add(arr[arr.length-1]);
		}

		System.out.println(nums);


	}
}
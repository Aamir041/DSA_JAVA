// problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

import java.util.Arrays;
public class RemoveDupliFrmSortedArray{
	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,1,2,3,3};
		int k = removeDuplicates(nums);
		System.out.println(k+ " " + Arrays.toString(nums));
	}

	static int removeDuplicates(int[] nums) {
		
		int[] temp = new int[nums.length];
		int lastNum = nums[0];
		int k=1;
		temp[0] = nums[0];
		
		boolean firstOccur = true;
		boolean secondOccur = false;

		for(int i=1; i<nums.length; i++){
		    if(nums[i] == lastNum){
		    	if(firstOccur == true && secondOccur == true){
		    		lastNum = nums[i];
		    		nums[i] = 0;
		    	}
		    	if(firstOccur == true && secondOccur == false){
		    		secondOccur = true;
		    		temp[k] = nums[i];
		    		lastNum = nums[i];
		    		k++;
		    	}
		    }

		    else if(nums[i] != lastNum){
		    	firstOccur = true;
		    	secondOccur = false;
		    	temp[k] = nums[i];
		    	lastNum = nums[i];
		    	k++;
		    }	

		}

		for(int i=0; i<temp.length; i++){
			nums[i] = temp[i];
		}

		return k;
    }
}
// problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// status : solved

import java.util.Arrays;

public class CountDuplicate{
	public static void main(String[] args) {
		int [] nums = {5,6,6,9,9,9,9,12,12,14};
		int c = removeDuplicates(nums);

		System.out.println(Arrays.toString(nums)+" "+c);
	}
	static int removeDuplicates(int[] nums) {
        int k=0;
        int lastNum = nums[0];
        for(int i=0 ; i<nums.length; i++){
        	if(i == 0){
        		k++;
        	}
        	if(nums[i]!=lastNum){
        			nums[k] = nums[i];
        			k++;
        	}
        	lastNum=nums[i];
        }
        return k;
    }

}
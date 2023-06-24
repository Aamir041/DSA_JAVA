// link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


import java.util.Arrays;

public class FirstNLastPosition{
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    
    }

    static int[] searchRange(int[] nums, int target) {
        
        int firstIndex=-1;
        int lastIndex=-1;
        int i=0;
        int j=nums.length-1;
        
        while(i<nums.length || j>=0){
            if(firstIndex != -1 && lastIndex != -1){
                return new int[] {firstIndex, lastIndex}; 
            }
            
            if(nums[i] == target && firstIndex == -1){
                firstIndex = i;
            }
            else{
                i++;
            }
            if(nums[j] == target && lastIndex == -1){
                lastIndex = j;
            }
            else{
                j--;
            }
        }
        
        return new int[] {firstIndex, lastIndex}; 
        
    }
}

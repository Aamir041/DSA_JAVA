// link : https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotateArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 6));
    }
    static int search(int[] nums, int target) {
        
        int min = nums[0];
        int minIndex  = 0;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }

        int[] sortedArr = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int j = minIndex + i;
            if(j > nums.length-1){
                sortedArr[i] = nums[j-nums.length];
            }
            else{
                sortedArr[i] = nums[j];
            }
        }

        int l=0;
        int h=nums.length-1;

        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(sortedArr[mid] < target){
                l =mid+1;
            }
            else if(sortedArr[mid] > target){
                h = mid -1;
            }
            else{
               int index =  mid+minIndex;
               if(index >= nums.length){
                   return index - nums.length;
               }
               else{
                   return index;
               }

            }
        }

        return -1;

    }
}

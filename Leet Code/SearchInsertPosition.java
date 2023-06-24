// link : https://leetcode.com/problems/search-insert-position/description/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {3,4,5,6,7,8};
        System.out.println(searchInsert(nums, 6));
    }

    static int searchInsert(int[] nums, int target) {
        
        int l=0;
        int h=nums.length-1;
        int m=0;

        while(l<=h){
            m = l + (h-l)/2;
            if(target > nums[m]){
                l=m+1;
            }
            else if(target < nums[m]){
                h=m-1;
            }
            else{
                return m;
            }
        }

        if(target < nums[m]){
            return m;
        }
        
        return m+1;
    }
}

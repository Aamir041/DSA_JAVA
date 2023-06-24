//link : https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicateNumber {
    public static void main(String[] args) {

        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }
    static int findDuplicate(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>max) max = nums[i];
        }
 
        int[] hashT = new int[max+1];
        
        for(int i=0; i<n; i++){
            hashT[nums[i]]++;
        }
 
        for(int i=0; i<max+1; i++){
            if(hashT[i] > 1){
                return i;
            }
        } 
        return 0;
 
 
     }
}

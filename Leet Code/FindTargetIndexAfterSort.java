// link : https://leetcode.com/problems/find-target-indices-after-sorting-array/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindTargetIndexAfterSort {

    static List<Integer> targetIndices(int[] nums, int target) {
        
        Arrays.sort(nums);

        List<Integer> targetIndices = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                targetIndices.add(i);
            }
        }

        return targetIndices;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(nums,target));
    }
}

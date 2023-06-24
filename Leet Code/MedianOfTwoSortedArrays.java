// link : https://leetcode.com/problems/median-of-two-sorted-arrays/

import java.util.Arrays;

public class MedianOfTwoSortedArrays{
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double res = findMedianSortedArrays(nums1,nums2);
        System.out.println(res);
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedLength = nums1.length+nums2.length;
        int[] mergedSortArr = new int[mergedLength];

        int mergeIndex=0;
        int i=0;
        int j=0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                mergedSortArr[mergeIndex] = nums1[i];
                i++;
                mergeIndex++; 
            }
            else{
                mergedSortArr[mergeIndex] = nums2[j];
                j++;
                mergeIndex++;
            }
        }

        while(i<nums1.length){
            mergedSortArr[mergeIndex] = nums1[i];
            i++;
            mergeIndex++;
        }

        while(j<nums2.length){
            mergedSortArr[mergeIndex] = nums2[j];
            j++;
            mergeIndex++;
        }

        double median = 0;
        if(mergedLength % 2 == 0){
            int z = mergedLength/2;
            // for precision divide with 2.0
            median = (mergedSortArr[z] + mergedSortArr[z-1])/2.0; // for precision divide with 2.0
        }
        else{
            int z = (mergedLength - 1)/2;
            median = mergedSortArr[z]; 
        }
        return median;
    }
}
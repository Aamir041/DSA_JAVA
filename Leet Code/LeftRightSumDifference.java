// link: https://leetcode.com/contest/weekly-contest-334/problems/left-and-right-sum-differences/

// Accepted

import java.util.Arrays;;
public class LeftRightSumDifference {

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRigthDifference(nums)));
    }

    static int[] leftRigthDifference(int[] nums) {
        int n = nums.length;

        int[] leftSum = new int[n];

        int[] rightSum = new int[n];

        int[] answer = new int[n];

        // calculating left sum
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                leftSum[i] = 0;
            } else {
                int sum = 0;
                for (int j = 0; j < i; j++) {
                    sum = sum + nums[j];
                }
                leftSum[i] = sum;
            }
        }

        // calculating right sum
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                rightSum[i] = 0;
            } else {
                int sum = 0;
                for (int j = n - 1; j > i; j--) {
                    sum = sum + nums[j];
                }
                rightSum[i] = sum;
            }

        }

        // answer array calc
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;

    }

}

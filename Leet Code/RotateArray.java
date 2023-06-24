
// problem link : https://leetcode.com/problems/rotate-array/
// status: accepted

import java.util.Scanner;
import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Array Length: ");
		int arrayLen = sc.nextInt();
		int[] nums = new int[arrayLen];

		System.out.println("\nEnter Numbers: ");
		for (int i = 0; i < arrayLen; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.print("\nEnter k: ");
		int k = sc.nextInt();

		System.out.println("\nOriginal Array: " + Arrays.toString(nums));

		rotate(nums, k);

		System.out.println("\nRotated Array: " + Arrays.toString(nums));

	}

	static void rotate(int[] nums, int k) {
		int arrayLen = nums.length;

		if (arrayLen == 0 || arrayLen == 1) {
			return;
		}

		while (k > arrayLen) {
			k = k - arrayLen;
		}

		int[] tempArray = new int[arrayLen];

		for (int i = 0; i < arrayLen; i++) {
			tempArray[i] = nums[i];
		}

		for (int i = 0; i < arrayLen; i++) {
			if (i + k < arrayLen) {
				nums[i + k] = tempArray[i];
			} else {
				nums[(i + k) - arrayLen] = tempArray[i];
			}
		}
	}
}
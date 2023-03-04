// link : https://leetcode.com/contest/weekly-contest-334/problems/find-the-divisibility-array-of-a-string/
// TLE :(

import java.util.Arrays;

public class DivisbilityOfArrayString{
    public static void main(String[] args) {
        String word = "998244353";
        int m = 3;
        System.out.println(Arrays.toString(divisibilityArray(word, m)));
    }

    static int[] divisibilityArray(String word, int m) {
        
        int n = word.length();
        int[] nums = new int[n];
        long num = 0;
        for(int i=0; i<n; i++){
            num = num*10 + (word.charAt(i)-'0');
            if(num%m==0){
                nums[i] = 1;
            }
            else{
                nums[i] = 0;
            }   
        }

        return nums;        
    }

}
// link : https://leetcode.com/contest/weekly-contest-334/problems/find-the-divisibility-array-of-a-string/

// TLE :(

import java.math.BigInteger;
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

        BigInteger M = new BigInteger(""+m); 
        
        for(int i=0; i<n; i++){
            BigInteger d = new BigInteger(word.substring(0,i+1));
            BigInteger[] BigArray = d.divideAndRemainder(M);
            String r = ""+ BigArray[1];
            int remainder = Integer.valueOf(r);
            if(remainder == 0){
                nums[i] = 1;
            }
            else{
                nums[i] = 0;
            }
            
        }
        
        return nums;
        
        
    }

}
// problem link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class countEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        int result=evenNumDigits(nums);
        System.out.println(result);

    }

    static int evenNumDigits(int[] nums){
        
        //! My solution
        /* 
         int count=0;
         for(int num : array){
             int tempNum = num;
             int digitCount=0;
             while(tempNum!=0){
                 tempNum=tempNum/10;
                 digitCount++;
             }
             if(digitCount%2==0){
                 count++;
             }
         }
         
         return count;
        */

        // Optimized Solution
        int count = 0;
        int digitCount  = 0;
        for(int ele : nums) {
            digitCount = (int)Math.log10(ele) + 1;
            System.out.println(ele+" "+digitCount);
            if(digitCount % 2 == 0) {
                count++;
            }
        }
        return count;

    }
}

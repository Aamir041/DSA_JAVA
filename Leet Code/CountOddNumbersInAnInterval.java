// problem link : https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
// status solved

public class CountOddNumbersInAnInterval{
    public static void main(String[] args) {
        int result = countOdds(15000, 30000);
        System.out.println(result);    
    }
    
    static int countOdds(int low, int high) {
        int count=0;
        if(low%2 == 0 && high%2==0 ){
            count = (high-low)/2;
        } else{
            count = ((high-low)/2)+1;
        }

        return count;
    }
}
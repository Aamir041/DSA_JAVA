// link : https://leetcode.com/problems/palindrome-number/description/

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int tempNum = x;
        int revNum = 0;
        while(tempNum !=0){
            revNum = revNum*10 + tempNum%10;
            tempNum = tempNum/10;
        }

        boolean ans = (revNum == x) ? true : false;
        return ans;
    }
}

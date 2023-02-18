// link : https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("A man, a plan, a canal: Panama");
    }

    static boolean isPalindrome(String s) {
        s = s.trim().replaceAll("[\\W\\s_]","").toLowerCase();
        int i = 0;
        for(int j=s.length()-1; j>=0; j--){
            if(s.charAt(j) != s.charAt(i)){
                return false;
            }
            i++;
        }

        return true;
    }
}

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(CheckPalindrome(str,0));
    }

    static boolean CheckPalindrome(String str,int i){
        int n = str.length();
        if(i>=n/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
        }
        return CheckPalindrome(str,i+1);
    }

}

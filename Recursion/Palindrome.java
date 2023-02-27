import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(CheckPalindrome(str,0,true));
    }

    static boolean CheckPalindrome(String str,int i,boolean result){
        int n = str.length();
        if(i>=n/2 || !result){
            return result;
        }
        if(str.charAt(i) != str.charAt(n-i-1)){
            result = false;
        }
        return CheckPalindrome(str,i+1,result);
    }

}

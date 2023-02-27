public class Palindrome {
    public static void main(String[] args) {
        String str = "anona";
        System.out.println(CheckPalindrome(str,0,str.length()-1,true));
    }

    static boolean CheckPalindrome(String str,int i,int j,boolean result){
        if(i>j || !result){
            return result;
        }
        if(str.charAt(i) != str.charAt(j)){
            result = false;
        }
        return CheckPalindrome(str,i+1,j-1,result);
    }

}

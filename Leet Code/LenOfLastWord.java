// link : https://leetcode.com/problems/length-of-last-word/description/

public class LenOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
    static int lengthOfLastWord(String s) {
        if(s == "") return 0;
        String[] strArr = s.trim().split("[\\s]");
        return strArr[strArr.length-1].length();
    }
    
}

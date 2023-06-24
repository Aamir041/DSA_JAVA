// link : https://leetcode.com/problems/determine-if-two-strings-are-close/description/


import java.util.*;
public class IfTwoStringAreClose {
    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca"));
    }
    static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }

        for(int i=0; i<word1.length(); i++){
            if(!word1.contains(""+word2.charAt(i))){
                return false;
            }
        }

        int[] word1Arr = new int[26];
        int[] word2Arr = new int[26];

        for(int i=0; i<word1.length(); i++){
            word1Arr[word1.charAt(i)-'a'] = word1Arr[word1.charAt(i)-'a'] + 1; 
        }

        for(int i=0; i<word2.length(); i++){
            word2Arr[word2.charAt(i)-'a'] = word2Arr[word2.charAt(i)-'a'] + 1; 
        }
        
        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);

        for(int i=0;i<26; i++){
            if(word1Arr[i] != word2Arr[i]){
                return false;
            }
        }

        return true;


    }
}

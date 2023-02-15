//  problem link : https://leetcode.com/problems/check-if-the-sentence-is-pangram/
// status : solved
import java.util.Arrays;

public class Panagram{
    public static void main(String[] args) {
        // String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }


     static boolean checkIfPangram(String sentence) {
       for(char letter = 'a'; letter<= 'z'; letter++){
            if(!sentence.contains(""+letter)){
                return false;
            }
       }
       return true;
    }
}
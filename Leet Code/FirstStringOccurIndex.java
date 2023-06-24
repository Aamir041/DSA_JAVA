// link : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class FirstStringOccurIndex {
    public static void main(String[] args) {
        System.out.println(strStr("abc","c"));
    }
    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
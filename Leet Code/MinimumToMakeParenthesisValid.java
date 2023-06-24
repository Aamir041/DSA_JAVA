//  link : https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
public class MinimumToMakeParenthesisValid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("()))(("));
    }

    static int minAddToMakeValid(String s) {
        int n = s.length();

        char[] stack = new char[n];
        int stkp = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack[stkp] = s.charAt(i);
                stkp++;
            }

            else if (s.charAt(i) == ')') {
                if (stkp != 0) {
                    if (stack[stkp - 1] == '(') {
                        stack[stkp - 1] = 'x';
                        stkp--;
                    }

                    else {
                        stack[stkp] = s.charAt(i);
                        stkp++;
                    }
                } else {
                    stack[stkp] = s.charAt(i);
                    stkp++;
                }

            }
        }

        return stkp;

    }

}

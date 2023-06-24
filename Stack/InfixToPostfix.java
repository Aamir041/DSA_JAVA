import java.util.*;

public class InfixToPostfix {

    // The main function
    public static void main(String[] args) {

        // Creating an object of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Reading the infix expression from the user
        String infix = sc.next();

        // Finding the length of the infix expression
        int n = infix.length();

        // Creating a character array stack with length n+1
        char[] stack = new char[n + 1];

        // Initializing the top of the stack
        int top = 0;

        // Creating a HashMap called precedence that stores the precedence of operators
        HashMap<Character, Integer> precedence = new HashMap<>();
        precedence.put('+', 1);
        precedence.put('-', 1);
        precedence.put('*', 2);
        precedence.put('/', 2);

        // Creating a StringBuffer called postfix to store the postfix expression
        StringBuffer postfix = new StringBuffer();

        // Looping through each character in the infix expression
        for (int i = 0; i < n; i++) {

            // If the character is an operand, append it to the postfix expression
            if (infix.charAt(i) >= 'a' && infix.charAt(i) <= 'z') {
                postfix.append(infix.charAt(i));
            }

            // If the character is an operator, push it to the stack based on its precedence
            else if (infix.charAt(i) == '+' || infix.charAt(i) == '*' || infix.charAt(i) == '/'
                    || infix.charAt(i) == '-') {
                if (top == 0) {
                    top++;
                    stack[top] = infix.charAt(i);
                } else {
                    for (int j = top; j >= 1; j--) {
                        if (precedence.get(stack[j]) >= precedence.get(infix.charAt(i))) {
                            postfix.append(stack[j]);
                            top--;
                        } else {
                            top++;
                            stack[top] = infix.charAt(i);
                        }
                    }
                    if (top == 0) {
                        top++;
                        stack[top] = infix.charAt(i);
                    }
                }

            }

        }

        // Pop the remaining elements from the stack and append them to the postfix
        // expression
        for (int i = top; i >= 1; i--) {
            postfix.append(stack[i]);
        }

        // Print the postfix expression
        System.out.println(postfix.toString());

    }

}

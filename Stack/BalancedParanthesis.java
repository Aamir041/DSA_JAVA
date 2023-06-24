import java.util.ArrayDeque;
import java.util.Scanner;
/*
 * for brackets {,},(,),[,]
*/

public class BalancedParanthesis {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String brackets = sc.next();
        char[] bkts = brackets.toCharArray();
        int n = brackets.length();

        int top = 0;
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            if(bkts[i] == '('){
                top++;
                stack.push(bkts[i]);
            }
            else if(bkts[i] == ')' && top != 0){
                if(stack.getLast() == '(' && bkts[i] ==')'){
                    top--;
                    stack.pop();
                }
                else{
                    top++;
                }
            }

        }

        if(top == 0){
            System.out.println("Valid Paranthesis");
        }
        else{
            System.out.println("Not A Valid Paranthesis");
        }

    }
}

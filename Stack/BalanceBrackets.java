import java.util.*;

public class BalanceBrackets {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Brackets Equation: ");
        String brackets = sc.next();
        int n = brackets.length();

        char[] bktEqn = brackets.toCharArray();
        char[] stack = new char[n+1];
        
        int top = 0; 
        for(int i=0; i<n; i++){
            
            if(bktEqn[i] == '{' || bktEqn[i] == '(' || bktEqn[i] == '[' ){
                top++;
                stack[top] = bktEqn[i];
            }

            else if( bktEqn[i] == '}' || bktEqn[i] == ')' || bktEqn[i] == ']' ){
                
                if( bktEqn[i] == '}'&& stack[top] == '{' ){
                    top--;
                }
                else if( bktEqn[i] == ')'&& stack[top] == '(' ){
                    top--;
                }
                else if( bktEqn[i] == ']'&& stack[top] == '[' ){
                    top--;
                }
                else{
                    top++;
                    stack[i] = bktEqn[i];
                }
            }
        }

        if(top == 0){
            System.out.println("Equation is Balanced.");
        }
        else{
            System.out.println("Equation is not Balanced!");
        }

    }
}

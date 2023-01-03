import java.util.Scanner;

public class calulatorProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter\n+ for addition\n- for subtraction\n* for multiplication\n/ from division\nX for Exit\n: ");

            char operation = in.next().trim().charAt(0);

            if (operation == '+') {

                System.out.print("Enter Number 1: ");
                int num1 = in.nextInt();

                System.out.print("Enter Number 2: ");
                int num2 = in.nextInt();

                int Result = num1 + num2;

                System.out.println("\nResult of addtion of " + num1 + " & " + num2 + " is " + Result);
            } 
            else if (operation == '-') {

                System.out.print("Enter Number 1: ");
                int num1 = in.nextInt();

                System.out.print("Enter Number 2: ");
                int num2 = in.nextInt();

                int Result = num1 - num2;

                System.out.println("\nResult of subtraction of " + num1 + " & " + num2 + " is " + Result);
            } 
            else if (operation == '*') {

                System.out.print("Enter Number 1: ");
                int num1 = in.nextInt();

                System.out.print("Enter Number 2: ");
                int num2 = in.nextInt();

                int Result = num1 * num2;

                System.out.println("\nResult of multiplcation of " + num1 + " & " + num2 + " is " + Result);
            } 
            else if (operation == '/') {

                System.out.print("Enter Number 1: ");
                int num1 = in.nextInt();

                System.out.print("Enter Number 2: ");
                int num2 = in.nextInt();

                if (num2 == 0) {
                    System.out.println("\nDivision with 0 is not possible");
                } 
                else {
                    int Result = num1 / num2;
                    System.out.println("\nResult of divison of " + num1 + " & " + num2 + " is " + Result);
                }
            }
            else if(operation == 'x' || operation == 'X'){
                break;
            }

        }

        in.close();

    }
}

package Methods;
import java.util.Scanner;

public class methodsInJava {
    public static void main(String[] args){
        /*
            // ONLY A STATIC FUNCTION CAN CALL STATIC FUNCTION THEREFORE BOTH main() ans sum() are static  
        */

        // VOID FUNCTION
        for(int i = 0; i<3; i++){
            sum();
        }

        // int return type fucntion
        for(int i = 0; i<3; i++){
            int res = sumInt();
            System.out.println("Result is : " + res);
            System.out.println("");
        }

        // String return type fucntion
        for(int i=0; i<3; i++){
            
            System.out.println("Hello! "+ greetName());
        }

        // Parameter passing
            // without taking input
            System.out.println("Sum of 45 and 78 is: "+sumPara(45, 78));

            // with taking input
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            int num1 = in.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = in.nextInt();
            System.out.println("Result -> "+sumPara(num1, num2));

    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2,res;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        res = num1 + num2;
        System.out.println("Sum is: "+res);
        System.out.println("");
        in.close();
    }

    static int sumInt() {
        Scanner in = new Scanner(System.in);
        int num1,num2,res;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        res = num1 + num2;
        in.close();
        return res;
    }

    static String greetName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        return name;
    }

    static int sumPara(int a,int b){
        int res = a + b;
        return res;
    }
}

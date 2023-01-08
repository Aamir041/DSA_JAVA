import java.util.Scanner;

public class fibonacciNumbers {
    public static void main(String[] args) {
        int INTIAL_NUMBER_1 = 0;
        int INTIAL_NUMBER_2 = 1;

        int FINAL_NUMBER = 0;

        System.out.print("Enter which term: ");
        Scanner in = new Scanner(System.in);
        int terms = in.nextInt();
        for(int i = 0; i<terms-1; i++){
            FINAL_NUMBER = INTIAL_NUMBER_1 + INTIAL_NUMBER_2;
            INTIAL_NUMBER_1 = INTIAL_NUMBER_2;
            INTIAL_NUMBER_2 = FINAL_NUMBER;
        }
        System.out.println("Number is : "+FINAL_NUMBER);
        in.close();
    }
}

import java.util.Scanner;

public class checkNumberOccurence {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int temp = num;
        System.out.print("Number to Check: ");
        int checkNum = in.nextInt();
        int count = 0;

        while(num != 0){
            if(num % 10 == checkNum){
                count++;
                
            }
            num=num/10;
        }
        System.out.println("Number "+checkNum+" in "+temp+" is present "+count+" times.");
        
        in.close();
    }
}

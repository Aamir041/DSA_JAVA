import java.util.Scanner;

public class dayName {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int DAY_NUM = in.nextInt();

        switch(DAY_NUM){
            case 1 -> System.out.println("It's Sunday");   
            case 2 -> System.out.println("It's Monday");
            case 3 -> System.out.println("It's Tuesday");
            case 4 -> System.out.println("It's Wednesday");
            case 5 -> System.out.println("It's Thursday");
            case 6 -> System.out.println("It's Friday");
            case 7 -> System.out.println("It's Saturday");
            default -> System.out.print("No such day");
        }
        in.close();

    }
}

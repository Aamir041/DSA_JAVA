import java.util.Scanner;

public class weekdayOrWeekend {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int DAY_NUM = in.nextInt();

        switch(DAY_NUM){
            case 2,3,4,5,6 -> System.out.println("It's a Weekday");
            case 1,7 -> System.out.println("It's a Weekend");
            default -> System.out.println("No Such Day");
        }

        in.close();
    }
}

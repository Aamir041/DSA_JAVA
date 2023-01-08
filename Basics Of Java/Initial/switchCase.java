import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){
        System.out.print("Enter the fruit name: ");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // old switch case syntax
        
        /* 
        switch(fruit.toLowerCase().trim()){
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("Sweet red fruit");
                break;
            case "orange":
                System.out.println("It's Orange in color lmao");
                break;
            case "banana":
                System.out.println("Minions love it and they sort of look like it");
                break;
            default:
                System.out.println("Never heard about "+fruit+" is it edible ? :|");
        
        }
        */

        // Enhanced switch case statement

        switch(fruit.toLowerCase().trim()){
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Sweet red fruit");
            case "orange" -> System.out.println("It's Orange in color lmao");
            case "banana" -> System.out.println("Minions love it and they sort of look like it");
            default -> System.out.println("Never heard about "+fruit+" is it edible ? :|");

        }

        in.close();
    }
}

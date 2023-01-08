import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args){

        System.out.print("ENTER NUMBER: ");
        Scanner in = new Scanner(System.in);
        int NUM =  in.nextInt();
        int TEMP_NUM = NUM;
        int REVERSE_NUM = 0;
        while(NUM !=0){    
            REVERSE_NUM = (REVERSE_NUM*10) + NUM%10;
            NUM=NUM/10;
        }
        System.out.println("Reverse of "+TEMP_NUM+" is: "+REVERSE_NUM);

        in.close();
    }
}

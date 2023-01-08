package Methods;

import java.util.Scanner;

/*
153 = 1^3 + 5^3 + 3^3 = 153 <- this is armstrong number
 */

public class isAmstrongNum {

    public static void main(String[] args) {
        for(int i = 100; i<=1000 ;i++){
            if(checkNum(i)){
                System.out.println(i);
            }
        }
    }

    static boolean checkNum(int n){
        if(n/100 <= 0){
            return false;
        }
        int sum = 0;
        int number = n;
        int temp_num;
        while(n > 0){
            temp_num = n%10;
            sum = sum + (temp_num*temp_num*temp_num);
            n=n/10;
        }

        if(number != sum){
            return false;
        }

        return true;
    }
    
}

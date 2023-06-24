import java.util.*;

public class squareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n = sc.nextInt();
        System.out.println("Answer: "+ sqrt(n));

    }
    static double sqrt(Double n){
        // Beyond Decimal
        int low = 0;
        int high = n.intValue();
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(mid*mid >= n.intValue()){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }


        return mid;
    }  
}

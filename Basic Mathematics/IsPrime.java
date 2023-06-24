import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        int n = 40;
        ArrayList<Integer> arePrime = new ArrayList<>();
    
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                arePrime.add(i);
            }
        }        

        System.out.println(arePrime);
    }
    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        int c = 2;
        while (c*c <= n) {
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}

import java.util.Scanner;
public class PrintLinearly1ToN {

    static void print(int i, int n){
        if(i>n) return;
        System.out.print(i+" ");
        print(++i, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);
    }
}

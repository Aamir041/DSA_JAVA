import java.util.Scanner;

public class OneToN{

	static void print(int i,int n){
		if(i>n) return; // this is base case
		System.out.println(i+" Aamir");
		print(i+1,n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(1,n);
	}

}
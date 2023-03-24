public class Fibonacci{

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int n = 12;
		for(int i=0; i<n; i++){

			if(i == 0){
				System.out.print(num1+", ");
			}
			else if(i == 1){
				System.out.print(num2+", ");
			}
			else{
				int res = num1 + num2;
				System.out.print(res+", ");
				num1 = num2;
				num2=res;
			}
		}

	}

}
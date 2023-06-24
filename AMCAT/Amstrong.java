public class Amstrong{
	public static void main(String[] args) {

		int number = 153;
		
		String w = ""+number;

		char[] numbers = w.toCharArray();
		
		int n = w.length();

		int sum = 0;
		for(int i=0; i<n; i++){
			sum = sum + (int)Math.pow(Integer.valueOf(""+numbers[i]),n);
		}

		if(sum == number){
			System.out.println("Yes");
		}
		else{
		    System.out.println("No");	
		}

	}

}
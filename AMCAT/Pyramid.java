public class Pyramid{
	public static void main(String[] args) {
		int n = 6;
		int numSpaces = 2*n - 1;
		int numStar = 1;
		int x = 1;
		while(x<=n){

			for(int i=0; i<numSpaces; i++){
				System.out.print(" ");
			}
			

			for(int i=0; i<numStar; i++){
			    System.out.print("* ");	
			}
			++x;
			numStar = 2*x-1;
			System.out.println();

		} 

	}
}
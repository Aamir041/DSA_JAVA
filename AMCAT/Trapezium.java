public class Trapezium{
	public static void main(String[] args) {
		
		int n = 4;
		int x = 0;
		int y = n-1;
		int right = 1;
		int left = n * n + n;
		int numSpaces = 0;

		while(x<n & y >= 0){

			for(int i=0; i<numSpaces; i++){
				System.out.print(" ");
			}
			numSpaces++;

			for(int i = right; i<right+n-x; i++){
			    System.out.print(i+"*");	
			}
			right = right + n - x;

			for(int i = left - y; i<=left; i++){
				
				if(i == left) {
					System.out.print(i);	
				}
				else{
					System.out.print(i+"*");	
				}
				
			}
			left = left - y-1;
			x++;
			y--;
			System.out.println();
		}

	}
}
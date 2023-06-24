public class FloydTriangle{
	public static void main(String[] args) {
		int x = 5;
		int count = 0;
		for(int i=1; i<=x; i++){
			for(int j=0; j<i; j++){
				System.out.print(++count + " ");
			}
			System.out.println();
		}
	}
}
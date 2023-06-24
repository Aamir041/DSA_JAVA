public class ReverseNumber{
	public static void main(String[] args) {
		int num = 75261520;

		// StringBuffer  sb = new StringBuffer(""+num);
		// String revStr = sb.reverse().toString();
		// int revNum = Integer.valueOf(revStr);
		// System.out.println(revNum);  
		
		int revNum = 0;
		int temp = num;
		while(temp!=0){
			revNum = revNum*10+temp%10;
			temp=temp/10;
		}
		System.out.println(revNum);
		
	}
}
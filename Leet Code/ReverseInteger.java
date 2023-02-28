public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
    static int reverse(int x) {
        long revNum = 0;
        int temp = x;
        while(temp!=0){
            revNum = revNum*10 + temp%10;
            temp = temp/10;
        }


        if(revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE ){
            return 0;
        }

        return (int) revNum;
    }
}

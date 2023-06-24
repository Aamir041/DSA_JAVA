public class FindX_RaiseToN{
    
    static double myPow(double x, int n) {
        double ans = Math.pow(x,n);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(5, 3));    
    }
}
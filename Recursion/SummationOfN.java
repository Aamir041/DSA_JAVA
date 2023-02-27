public class SummationOfN {
    public static void main(String[] args) {
        int sum = add(10);
        System.out.println(sum);    
    }

    static int add(int n){
        if(n==0) return 0;
        return n+add(n-1);
    }

}

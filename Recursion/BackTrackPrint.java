public class BackTrackPrint {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        if(n<1) return;
        print(n-1);
        System.out.print(n+" ");
    }
}

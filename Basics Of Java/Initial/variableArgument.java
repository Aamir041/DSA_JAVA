import java.util.Arrays;

public class variableArgument {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6);
    }
    static void fun(int...vars){
        System.out.println(Arrays.toString(vars));
    }
}

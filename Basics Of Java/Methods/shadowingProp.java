// package Methods;
public class shadowingProp {
    static int x = 90; // global varible x is declared and intialized
    public static void main(String[] args) {
        System.out.println(x); // print global variable x
        
        int x; // in locak scope of psvm x is created so global x is no longer accessible -> this is shadowing

        x = 40; // value to x in local scope is assigned
        System.out.println(x); // print x from local scope
        func();
        
    }

    static void func(){
        System.out.println(x); // print global variable x
    }
}

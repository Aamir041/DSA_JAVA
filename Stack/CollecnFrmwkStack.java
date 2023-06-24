import java.util.*;

public class CollecnFrmwkStack {

    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(14);
        stack.push(15);
        stack.push(16);

        for(Iterator<Integer> it = stack.iterator();it.hasNext();){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        
        stack.pop();

        for(Iterator<Integer> it = stack.iterator();it.hasNext();){
            System.out.print(it.next()+" ");
        }
        System.out.println();

               
    }
}

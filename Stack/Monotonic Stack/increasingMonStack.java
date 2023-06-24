import java.util.ArrayList;

public class increasingMonStack {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 12, 10};
        ArrayList<Integer> stack = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            while(stack.size() != 0 && stack.get(stack.size()-1) >arr[i]){
                stack.remove(stack.size()-1);
            }
            stack.add(arr[i]);
        }
        System.out.println(stack);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(10);
        for(int i = 0; i<10; i++){
            numbers.add((i*10)+11);
        }
        System.out.println(numbers);
        numbers.add(111);
        
        // Printing ArrayList using E-for loop
        for(int num : numbers) {
            System.out.println(num);
        }

        // Multidimensional Array List
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

        for(int i=0; i<3; i++){
            multiList.add(new ArrayList<>());
        }

        Scanner in = new Scanner(System.in);

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                multiList.get(i).add(in.nextInt());
            }
        }

        System.out.println(multiList);
    }
}

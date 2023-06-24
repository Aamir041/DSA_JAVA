import java.util.Arrays;

public class enhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {27,28,34,40,41};

        for(int number : numbers){ // for every "number" in array called numbers
            System.out.print(number + " "); // print number
        }

        // ! Inbuilt method to print all elements in array is this
        System.out.println(Arrays.toString(numbers));

        // ! In Java 2D Array can be like this
        int[][] arr2D = {
            {1,2,3,4},
            {5,6,7},
            {8,9}
        };
        
        // Printing every number in 2D array using Enhanced for loop
        for(int[] arr : arr2D){
            for(int num : arr){
                System.out.println(num);
            }
        }

    }
}

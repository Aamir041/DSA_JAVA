import java.util.Scanner;

public class basicOfArray{
    public static void main(String[] args) {

        /*
         * Syntax of array :- datatype[] variable_name = new datatype[size of array];
         */

        int[] array1; // declaration of array, this  things happens at compile time 

        array1 = new int[5]; // object of int is being created in heap mem, this is done at run time 

        int[] array2 = new int[5]; 

        int[] array3 = {1,2,3,4,5}; // values added in array directly

        /*
         * In java Array is dynamically allocated i.e. at the run time memory is allocated
         * mem block in array in java may or may not be continuos totally depends upon of jvm
         * heap object are not continuos
         * new keyword is used to create an object
         * new int[5] -> will create a new object of int whose size is 5
         */


         for(int i = 0; i<array3.length; i++){
            System.out.println(array3[i]);
         }

         Scanner in = new Scanner(System.in);
         
         String[] names = new String[5];

         for(int i=0; i<5; i++){
            System.out.print("Enter names: ");
            names[i] = in.next();
         }
         System.out.println("\n");
         for(int i=0; i<5; i++){
            System.out.println(names[i]);
          
         }
        
    }
}
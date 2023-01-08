public class twoD_Array {
    public static void main(String[] args) {
         
                // * Initializing 2D Array
        
                int[][] numbers = new int[3][2];
        
                // * int[][] <- two bracket required for 2D array 
                // * int[number of rows][number of columns] <- giving size of array
                // * not necessary to give number of columns in 2d array in java
                
                // ! In Java 2D Array can be like this
                int[][] arr2D = {
                    {1,2,3,4},
                    {5,6,7},
                    {8,9}
                };
        
                // ? PRINTING length of every array in every row in @arr2D
        
                // for(int i = 0; i<arr2D.length; i++ ){
                //     System.out.println(arr2D[i].length);
                // }

                // Printing every number in 2D array using Enhanced for loop
                for(int[] arr : arr2D){
                    for(int num : arr){
                        System.out.println(num);
                    }
                }
        
        
            
        
        
    }
    
}

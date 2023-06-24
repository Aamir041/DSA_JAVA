import java.util.Arrays;

public class Array2DSearch {
    public static void main(String[] args) {
        int[][] twoD = {
            {12,34,45,9},
            {55,47,37,61,88},
            {41,28,63,74,101,23}
        };

        int target=61;

        int[] result = searchIn2DArray(twoD,target);

        System.out.println(Arrays.toString(result));

        int maxNum = maxIn2DArray(twoD);
        System.out.println(maxNum);

    }


    // * returns the location in which target is present in 2D array
    // * return new int[]{-1,-1}/new int[]{i,j} is creating a new object of array of int and value of that array is within those curly brackets
    // * return new int[]{-1,-1}, returns an array in which array value is [-1,-1]
    static int[] searchIn2DArray(int[][] array2D, int target){

        // if 2D array does not contain any array then return an array -1,-1
        if(array2D.length == 0) {
            return new int[]{-1,-1};
        }

        // using normal for loop
        for(int i=0; i<array2D.length; i++){
            for(int j=0; j<array2D[i].length; j++){

                // checks if array is present at "ith row and jth column" and returns [i,j] as result if present
                if(target == array2D[i][j]){
                    return new int[]{i,j};
                }
            }
        }

        // after iterating over all the arrays in 2D array nowhere is element to be found the return [-1,-1]
        return new int []{-1,-1};
    }



    // returns maximum value with in the 2D array
    static int maxIn2DArray(int[][] array2D){
        
        // if no array in 2D array return max value of INT data type
        if(array2D.length == 0){
            return Integer.MAX_VALUE;
        }

        // initialize max as first element in minimum value a integer can hol 
        int max = Integer.MIN_VALUE;

        for(int[] arr: array2D){
            for(int num: arr){

                if(num > max){
                    max=num;
                }
            }
        }

        return max;

    }
}

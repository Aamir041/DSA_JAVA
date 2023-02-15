// problem statement: https://leetcode.com/problems/set-matrix-zeroes/
// status : to-do...

import java.util.Scanner;
import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter m: ");
        int m = sc.nextInt();

        System.out.print("\nEnter n: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter Numbers");
        for(int i = 0; i<m; i++){
            
            for(int j = 0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Array: " + Arrays.toString(matrix));

        setZeroes(matrix);

        System.out.println("\nNew Array: " + Arrays.toString(matrix));

    }

    static void setZeroes(int[][] matrix) {

    }
}

// problem statement: https://leetcode.com/problems/set-matrix-zeroes/
// status : to-do...

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);

        int col = matrix[0].length;
        int row = matrix.length;
        for(int i=0;i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }

    static void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> position = new ArrayList<>();
        
        int col = matrix[0].length;
        int row = matrix.length;

        for(int i=0;i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 0){
                    ArrayList<Integer> index = new ArrayList<>();
                    index.add(i);
                    index.add(j);
                    // System.out.println(index);
                    position.add(index);
                }
            }
        }

        for(int i=0; i<position.size(); i++){

            int curRow = position.get(i).get(0);
            int curCol = position.get(i).get(1);
            
            //rows
            for(int j=0; j<col; j++){
                matrix[curRow][j] = 0;
            }

            // cols
            for(int j=0; j<row; j++){
                matrix[j][curCol] = 0;
            }
        }

    }
}

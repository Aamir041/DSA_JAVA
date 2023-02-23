// link : https://leetcode.com/problems/spiral-matrix/

import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        
        int left = 0;
        int right = matrix[0].length-1;

        while(true){

            // traversing left to rigt  from top
            for(int i=left; i<=right; i++){
                numbers.add(matrix[top][i]);
            }

            // we traversd all the top so increment top
            top++;
            if(top > bottom || left > right)break;

            // traversing downwards from left side
            for(int i=top; i<=bottom; i++){
                numbers.add(matrix[i][right]);
            }
            
            //we travese whole right side so decerement right
            right--;
            if(top > bottom || left > right)break;

            // traversing bottom from right to left
            for(int i=right; i>=left; i--){
                
                numbers.add(matrix[bottom][i]);
            }

            // bottom fully traversed so decrement bottom
            bottom--;
            if(top > bottom || left > right)break;

            // traversing bottom to top on right side
            for(int i=bottom; i>=top; i--){
                numbers.add(matrix[i][left]);
            }

            left++;
            if(top > bottom || left > right)break;

        }

        return numbers;

    }
}

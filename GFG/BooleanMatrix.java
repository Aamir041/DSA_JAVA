// link : https://practice.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/0

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int R = matrix.length;
        
        int C = matrix[0].length;
        
        ArrayList<ArrayList<Integer>> indexes= new ArrayList<>();
        
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                
                if( matrix[i][j] == 1 ){
                    ArrayList<Integer> position = new ArrayList<>();
                    position.add(i);
                    position.add(j);
                    indexes.add(position);
                }
                
            }
        }
        
        for(int i=0; i<indexes.size(); i++){
            int currRow = indexes.get(i).get(0);
            
            int currCol = indexes.get(i).get(1);
                       
            
            // cols
            for(int j=0; j<R; j++){
                matrix[j][currCol] = 1;
            }
            
            // rows
            for(int j=0; j<C; j++){
                 matrix[currRow][j] = 1;
            }
        }
    }
}
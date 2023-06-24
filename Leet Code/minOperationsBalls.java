// problem statement : https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/

import java.util.Scanner;
import java.util.Arrays;

public class minOperationsBalls{
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String boxes = sc.next();
	    System.out.println(Arrays.toString(minOperations(boxes)));
		sc.close();
	}

	
	static int[] minOperations(String boxes) {
        int[] boxArr = getBoxArray(boxes);
    
        int[] resultArray = new int[boxArr.length];

        for(int i=0; i<resultArray.length;i++){
        	resultArray[i] = 0;
        }
        
        for(int i=0; i<boxArr.length; i++){
        	for(int j = 0; j<boxArr.length; j++){
        		if(i != j){
        			if(boxArr[j] == 1){
        				if(i<j){
        					resultArray[i] = resultArray[i] + (j-i); 
        				}
        				else if(i>j){
        					resultArray[i] = resultArray[i] + i-j;
        				}
        			}
        		}
        	}
        }

        return resultArray;
    }

    static int[] getBoxArray(String boxes){
    	int[] boxArr = new int[boxes.length()];
    	for(int i=0; i<boxes.length(); i++){
    		boxArr[i] = Integer.parseInt(""+boxes.charAt(i));
    	}
    	return boxArr;
    }
}
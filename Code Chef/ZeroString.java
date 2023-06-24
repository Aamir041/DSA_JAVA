// link : https://www.codechef.com/problems/ZEROSTRING

import java.util.*;
import java.lang.*;
import java.io.*;

public class ZeroString{
	
    public static void main (String[] args) throws java.lang.Exception{
        
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases >0){
            int strLen = sc.nextInt();
            String str = sc.next();
            char[] strArr = str.toCharArray();
           
            int res1 = delete(strArr);
            int res2 = flipDelete(strArr);
           
            if(res1 > res2){
             System.out.println(res2);
            }
            else{
             System.out.println(res1);
            }

            testCases--;
        }

	}

    static int delete(char[] strArr){
        int numOperation = 0;

        // delete 1's
        for(int i=0; i<strArr.length; i++){
            if(strArr[i] == '1'){
                numOperation++;
            }
        }

        return numOperation;
    };

    static int flipDelete(char[] strArr){
        
        int numOperation = 0;
        
        for(int i=0; i<strArr.length; i++){
            if(strArr[i] == '1'){
                strArr[i] = '0';
            }
            else if(strArr[i] == '0'){
                strArr[i] = '1';
            }
        }
        
        numOperation++;
        
        for(int i=0; i<strArr.length; i++){
            if(strArr[i] == '1'){
                numOperation++;
            }
        }

        return numOperation;
    }
}

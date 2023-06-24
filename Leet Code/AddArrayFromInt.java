// link : https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.*;

public class AddArrayFromInt{
	public static void main(String[] args) {
        int[] num = {2,1,5};
		System.out.println(addToArrayForm(num,806));

	}

	static List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> summedUpNumbers = new ArrayList<>(0);
        int carry=0;
        int i = num.length-1;
        boolean isCarry = false;
        
        while(i>=0 || k!=0){
            
            if(i >= 0){
                int temp = num[i] + k%10 + carry;
                summedUpNumbers.add(0,temp%10);
                carry = temp/10;
                if(carry == 0){
                    isCarry=false;
                }
                else{
                    isCarry=true;
                }
                k=k/10;
                i--;
            }
            else{
                int temp = k%10 + carry;
                summedUpNumbers.add(0,temp%10);
                carry = temp/10;
                if(carry == 0){
                    isCarry=false;
                }
                else{
                    isCarry=true;
                }
                k=k/10;
            }
        }

        if(isCarry){
            summedUpNumbers.add(0,carry);
        }

        return summedUpNumbers;
    }

}
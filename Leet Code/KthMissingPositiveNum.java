//link : https://leetcode.com/submissions/detail/910126822/
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] parentArray = new int[1001];

        int index=0;
        int number=1;

        while(index<1001){
            
            if(checkNumber(number,arr)){
                parentArray[index] = number;
                index++;
                }
            
            number++;

        }


        return parentArray[k-1];   
    }

    boolean checkNumber(int number, int[] arr){
        int l=0;
        int h = arr.length-1;
        
        while(l<=h){
            int mid = l + ((h-l)/2);
            if( arr[mid] > number){
                h = mid - 1;
            }
            else if(arr[mid] < number){
                l = mid + 1;
            }
            else if(arr[mid] == number){
                return false;
            }
        }

        return true;
    }

}
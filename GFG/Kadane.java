public class Kadane{

    static long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long maxSum = arr[0];
        long currSum = 0L;
        
        for(int i=0; i<n; i++){
            currSum = currSum + arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        
        return maxSum;
        
    }

    public static void main(String[] args) {
        int []Arr = {1,2,3,-2,5};
        System.out.println(maxSubarraySum(Arr, 5));
    }
}
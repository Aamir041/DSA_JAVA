public class MaxSumK{
    /*
     * Given an array of integers of size ‘n’, 
     * Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.
     */

    public static void main(String[] args) {

        // int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        // int k = 4;

        int[] arr = {1,2,3,4,5,6,1};
        int k = 3;
        
        // int[] arr = {100, 200, 300, 400};
        // int k = 2;

        /*
         * int max_sum = Integer.MIN_VALUE;
         * int n = arr.length;
         * int times = n%2 == 0 ? n-k+1 : n - k;
 
        for(int i=0; i<times; i++){
            int curr_sum = 0;
            for(int j = i; j<i+k; j++){
                
                curr_sum += arr[j];
            }
            max_sum = max_sum > curr_sum ? max_sum : curr_sum;
            System.out.println(max_sum);
        }
         */

         int n  =arr.length;

         int window_sum = 0;
         for(int i=0; i<k; i++){
            window_sum += arr[i];
         }
         curr_sum

         for(int i=k; i<n; i++){
            int curr_sum = window_sum + arr[i] - arr[i-k];
            window_sum = window_sum > curr_sum ? window_sum : curr_sum;
         }

         System.out.println(window_sum);

       

    }
}
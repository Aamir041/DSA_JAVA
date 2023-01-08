public class maxElement {
    public static void main(String[] args) {
        int[] arr = {23,56,17,45,39,17};

        /*
         TODO -> make a function that returns maximum element in an Array
         TODO -> make a that returns max value element with in an range of Array
         ! USE  OVERLOADING OF FUNCTION
         */
        int result1 = max(arr);
        System.out.println(result1);

        int result2 = max(arr,3,5);
        System.out.println(result2);
    }

    static int max(int[] array){
        
        int max=array[0];
        for(int i =1; i<array.length; i++){
            if(max<array[i]){
                max = array[i]; 
            }
        }
        return max;
    }

    static int max(int[] array, int a, int b){
        int max = array[a];
        for(int i = a+1; i<=b; i++){
            if(max<array[i]){
                max = array[i];
            }
        }

        return max;
    }
}

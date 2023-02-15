public class Find_XOR_Sum {
    public static void main(String[] args) {

        int [] arr1 = {12};
        int [] arr2 = {4};

        System.out.println(getXORSum(arr1,arr2));
    }

    static int getXORSum(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int[] result = new int[m*n];
        int k = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                result[k] = arr1[i]&arr2[j];
                k++;
            }       
        }

        int xorSum = 0;

        for(int i=0; i<(m*n); i++){
            xorSum = xorSum ^ result[i];
        }

        return xorSum;

    }
}

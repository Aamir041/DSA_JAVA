import java.util.Arrays;

// link : https://leetcode.com/problems/fair-candy-swap/

public class FairCandySwap {
    public static void main(String[] args) {

        int[] aliceSizes = {2};

        int[] bobSizes = {1,3};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));

    }

    
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int[] ans = new int[2];
            int totalAlice = 0;
            int totalBob = 0;
            
            for(int i =0; i<aliceSizes.length; i++){
                totalAlice = totalAlice + aliceSizes[i];
            }
    
            for(int i =0; i<bobSizes.length; i++){
                totalBob = totalBob + bobSizes[i];
            }
    
            for(int i=0; i<aliceSizes.length; i++){
                for(int j=0; j<bobSizes.length; j++){
                    int aliceGave = totalAlice - aliceSizes[i] + bobSizes[j];
                    int bobGave = totalBob - bobSizes[j] + aliceSizes[i];
                    if(aliceGave == bobGave){
                        return new int[] { aliceSizes[i],bobSizes[j] };
                    }
                } 
            }
    
            return new int[] {0,0};
    
        }
    
}

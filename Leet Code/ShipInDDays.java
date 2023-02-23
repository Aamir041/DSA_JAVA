public class ShipInDDays {
    public static void main(String[] args) {
        int[] wts = {1,2,3,1,1};
        int days = 4;
        System.out.println(shipWithinDays(wts,days));
    }

    static int shipWithinDays(int[] weights, int days) {
        
        int low = weights[0];
        int high = 0;

        for(int i=0; i<weights.length; i++){
            if(low > weights[i]) low = weights[i];
            high = high+weights[i];
        }

        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(checkMid(weights, days, mid)){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    static boolean checkMid(int[] wts,int days,int mid){
        int takenDay = 1;
        int wt = 0;
        for(int i=0; i<wts.length; i++){
            if(wts[i] > mid) return false;
            if(wt+wts[i] <= mid){
                wt = wt+wts[i];
            }
            else{
                wt=wts[i];
                takenDay++;
            }
        }
        if(takenDay <= days) return true;
        return false;
    }
}

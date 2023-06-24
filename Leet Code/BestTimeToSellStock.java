

public class BestTimeToSellStock{

    static int maxProfit(int[] prices) {
        int getPrice=prices[0];
        int profit = 0; 
        for(int i=1; i<prices.length; i++){
            if(getPrice < prices[i]){
                if(profit < prices[i] - getPrice){
                    profit = prices[i] - getPrice;
                }
            }
            if(getPrice > prices[i]){
                getPrice = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
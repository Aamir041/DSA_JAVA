// problem link : https://leetcode.com/problems/richest-customer-wealth/description/

public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts){

        // if no customers are added in accounts then return 0
        if(accounts.length == 0){
            return 0;
        }

        // let max wealth at start be 0
        int max=0;

        
        for(int cust[]:accounts){

            // calculate wealth of each customer
            int custWealth = calculateWealth(cust);

            // if customer wealth is greater than previous max wealth then change max value to current customers wealth
            if(custWealth > max){
                max = custWealth;
            }
        }

        // return max value
        return max;
    }

    static int calculateWealth(int[] deposits){

        // if no bank accounts in customer found return wealth of that customer as 0
        if(deposits.length == 0){
            return 0;
        }

        int wealth = 0;

        // calculate total wealth of that customer by adding all money of all bank accounts
        for(int money: deposits){
            wealth = wealth + money;
        }

        // return calculated wealth
        return wealth;
        
    }
}

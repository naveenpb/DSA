package Arrays;

public class BuyandSellStocks {
    // here we have to caculate the maximum profit .. see the question in video for more clarification

    public static void buySellStocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int a = 1;
        int maxprofit = 0;
        for(int i =0 ;  i<prices.length ;i++){
            if(buyprice < prices[i]){
                // i will get profit
                int profit = prices[i] - buyprice ; // today profit
                System.out.println("The profit in day " + a + " is "+ profit);
                a++;
                maxprofit =  Math.max(maxprofit,profit);// max profit of all day
            }
            else{
                buyprice = prices[i];
                System.out.println("The profit in day " + a + " is 0");
                a++;
                
            }
        }
        System.out.println("The max profit is " + maxprofit);

    }
    public static void main(String[] args) {
        int prices[] ={7,1,5,3,6,4};
        buySellStocks(prices);
    }

}

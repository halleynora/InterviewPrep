public class BuyAndSellStocks {


    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        if (prices == null) return 0;

        for(int i = 0; i<prices.length-1; i++){

            if (prices[i] < prices[i +1]){
                maxProfit += prices[i+1] - prices[i];
            }

        }

        return maxProfit;

    }

    public static void main(String[] args)
    {
        int[] arr = new int[] {7,1,5,3,6,4};
        System.out.println("I am a Geek");
        int maxProfit = maxProfit(arr);
        System.out.println("Max Profit:" + maxProfit);
    }
}

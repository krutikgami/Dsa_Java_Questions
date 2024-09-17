package Arrays;

class Buy_sell_stock {

    // O(n2)
    // public static int maxProfit(int[] prices) {
    //     int a = Integer.MIN_VALUE, z = 0 ,diff =0;
    //     for (int i = 0; i < prices.length -1; i++) {
    //         for (int j = i + 1; j < prices.length; j++) {
    //             diff = prices[j] - prices[i];
    //             if (diff > a) {
    //                 a = diff;
    //             }
    //         }
    //         z = Math.max(diff, a);
    //     }
    //     if (z < 0) {
    //         return 0;
    //     }
    //     return z;
    // }

    // public static void main(String[] args) {
    //     int prices[] = { 7, 1, 5, 3, 6, 4 };
    //     System.out.println(maxProfit(prices));
    // }

    public static int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int profit = 0;
        int sellprice = 0;

     for(int i = 1;i < prices.length;++i){
        profit = prices[i] - buyprice;
        if(profit < 0 && prices[i] < buyprice){
            buyprice = prices[i];
        }
        sellprice = Math.max(profit,sellprice);
    }
    if (sellprice<0) {
        return 0;
    }
     return sellprice;
    }
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }

}
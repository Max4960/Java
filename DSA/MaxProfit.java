import java.util.Arrays;

public class MaxProfit {
    // brute force solution O(n^2)
//    public int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            int[] futures = Arrays.copyOfRange(prices, i+1, prices.length);
//            for (int j = 0; j < futures.length; j++) {
//                if (futures[j] - prices[i] > maxProfit) {
//                    maxProfit = futures[j] - prices[i];
//                }
//            }
//        }
//        return maxProfit;
//    }
    // two pointer solution O(n)
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}

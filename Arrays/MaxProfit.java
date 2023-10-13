// 1) Naive Approach
// A simple approach is to try buying the stocks and selling them every single day when profitable and keep updating the maximum profit so far.

// Follow the steps below to solve the problem:

// Try to buy every stock from start to end – 1
// After that again call the maxProfit function to calculate answer
// curr_profit = price[j] – price[i] + maxProfit(start, i – 1) + maxProfit(j + 1, end)
// profit = max(profit, curr_profit)

// Time Complexity: O(n2), Trying to buy every stock and exploring all possibilities.
// Auxiliary Space: O(1)

// public class MaxProfit {

//     static int maxProfit(int price[],int start, int end){
//             if (end<= start)
//                 return 0;

//             int profit = 0;

//             for(int i = start; i <end; i++){
//                 for(int j =i; j<=end ; j++){
//                     if(price[j] > price[i]){
//                         int curr_profit = price[j] - price[i] 
//                                             + maxProfit(price, start, i - 1)
//                                             + maxProfit(price, j + 1, end);

//                         profit = Math.max(profit, curr_profit);

//                     }
//                 }
//             }
//             return profit;

//         }

//     public static void main(String[] args) {

//         int arr[] = { 100, 180, 260, 310, 40, 535, 695 };
//         System.out.println(maxProfit(arr, 0, arr.length-1));
//     }
// }

// Efficient Approach (Valley Peak Approach):
// In this approach, we just need to find the next greater element and subtract it from the current element so that the difference keeps increasing until we reach a minimum. If the sequence is a decreasing sequence, so the maximum profit possible is 0.

// Follow the steps below to solve the problem:

// maxProfit = 0
// if price[i] > price[i – 1]
// maxProfit = maxProfit + price[i] – price[i – 1]

// Time Complexity: O(n), Traversing over the array of size n
// Auxiliary Space: O(1)

public class MaxProfit {

    static int maxProfit(int price[]) {
        int profit = 0;
        for (int i = 1; i<price.length; i++) {
            if (price[i] > price[i - 1]) {
                profit += price[i] - price[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {

        int arr[] = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(maxProfit(arr));
    }
}
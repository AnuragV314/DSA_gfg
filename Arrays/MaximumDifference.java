// 1) Naive Approach:
// We use two loops. In the outer loop, pick elements one by one and in the inner loop calculate the difference of the picked element with every other element in the array and compare the difference with the maximum difference calculated so far. Below is the implementation of the above approach : 

// Time Complexity : O(n^2) 
// Auxiliary Space : O(1)

// public class MaximumDifference{
//     static int max(int x, int y){
//         if(x>y)
//             return x;
//         return y;
//     }
//     static int maxDiff(int arr[]){
//         int res = arr[1] - arr[0];
//         for(int i =0; i<arr.length; i++){
//             for(int j = i+1 ; j<arr.length ; j++){
//                 res = max(res, arr[j]-arr[i]);
//             }
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int arr[] = {2, 3, 10, 6, 4, 8, 1};
//         System.out.println(maxDiff(arr));
//     }
// }

// 2) Efficient Approach:
// In this method, instead of taking difference of the picked element with every other element, we take the difference with the minimum element found so far. So we need to keep track of 2 things:

//  Maximum difference found so far (max_diff). 
//  Minimum element visited so far (min_element).
// Time Complexity : O(n) 
// Auxiliary Space : O(1)

public class MaximumDifference {
    static int max(int x, int y) {
        if (x > y)
            return x;
        return y;
    }

    static int min(int x, int y) {
        if (x > y)
            return y;
        return x;
    }

    static int maxDiff(int arr[]) {
        int res = arr[1] - arr[0], min_val = arr[0];

        for(int i=1; i<arr.length; i++){
            res = max(res, arr[i]-min_val);
            min_val = min(min_val, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
        System.out.println(maxDiff(arr));
    }
}

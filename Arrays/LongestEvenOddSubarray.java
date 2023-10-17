// 1)Naive Approach 
// The idea is to consider every subarray and find the length of even and odd subarrays.

// Time Complexity: O(n2), Iterating over every subarray therefore N2 are possible
// Auxiliary Space: O(1)

// public class LongestEvenOddSubarray {
//     static int maxEvenOdd(int arr[]){
//         int res = 1;
//         for(int i=0; i<arr.length; i++){
//             int curr = 1;
//             for(int j = i+1; j<arr.length; j++){
//                 if((arr[j]%2==0 && arr[j-1]%2 != 0) || (arr[j]%2 != 0 && arr[j-1]%2==0)){
//                     curr++;
//                 }
//                 else
//                     break;
//             }
//             res = Math.max(curr, res);
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 7, 9};
//         System.out.println(maxEvenOdd(arr));
//     }
// }


// 2)Efficient Approach 
// By simply storing the nature of the previous element we encounter( odd or even) and comparing it with the next element.

// Time Complexity: O(n), Since we need to iterate over the whole array once
// Auxiliary Space: O(1)


public class LongestEvenOddSubarray {
    static int maxEvenOdd(int arr[]){
        int res = 1;
        int curr = 1;
        for(int i=1; i<arr.length; i++){
                if((arr[i]%2==0 && arr[i-1]%2 != 0) || (arr[i]%2 != 0 && arr[i-1]%2==0)){
                    curr++;
                    res = Math.max(curr, res);
                }
                else
                    curr = 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 9};
        System.out.println(maxEvenOdd(arr));
    }
}





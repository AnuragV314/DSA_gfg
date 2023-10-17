// 1) Naive Approach:
// In this approach, we use two looks and traverse the array from start to end. At each element, we check if it is 1 or 0. If the element is 1, we increment the count variable and count the number of 1s along with it if any. After each completion of the inner loop, we find the maximum between the current count and the previous count.

// Time Complexity : O(n2) 
// Auxiliary Space : O(1)

// public class Maximumconsecutive1s{
//     static int maxConsecutive(int arr[]){
//         int res = 0;
//         int n =arr.length;

//         for(int i=0; i<n; i++){
//             int count = 0;
//             for(int j=i; j<n; j++){
//                 if(arr[j] == 1)
//                     count++;
//                 else break;
//             }
//             res = Math.max(count, res);
//         }

//         return res;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
//         System.out.println(maxConsecutive(arr));
//     }
// }

 
// 2)  Efficient Approach:
// An efficient solution is to traverse the array from left to right. If we see a 1, we increment the count and compare it with the maximum so far. If we see a 0, we reset the count to 0.

// Time Complexity : O(n) 
// Auxiliary Space : O(1)
public class Maximumconsecutive1s{
    static int maxConsecutive(int arr[]){
        int res = 0;
        int n =arr.length;
        int count = 0;

        for(int i=0; i<n; i++){
                if(arr[i] == 0)
                    count=0;
                else {
                    count++;
                    res = Math.max(count, res);
                }
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecutive(arr));
    }
}
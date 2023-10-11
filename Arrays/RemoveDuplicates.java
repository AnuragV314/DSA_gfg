// 1) Naive Approach
// In this approach, we traverse the array and find the distinct elements, 
// which are then copied to a new array. After all the distinct elements 
// are copied to the new array, the elements from the new array are transferred
// back to the original array.

// Time Complexity : O(n) 
// Auxiliary Space : O(n)  // new array for storing distinct elements is required

// public class RemoveDuplicates {

//     static int remDups(int arr[], int n) {
//         int temp[] = new int[n];
//         temp[0] = arr[0];
//         int res = 1;

//         for (int i = 0; i < n; i++) {
//             if (temp[res - 1] != arr[i]) {
//                 temp[res] = arr[i];
//                 res++;
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             arr[i] = temp[i];
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 10, 20, 20, 30, 30, 30 }, n = 6;

//         System.out.println(remDups(arr, n));
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }

// 2) Efficient Approach:
// In this approach we compare the current element with the previous distinct
// element and check if the current element is a distinct element or not.

// Time Complexity : O(n)
// Auxiliary Space : O(1)

public class RemoveDuplicates {
    static int remDups(int arr[]) {
        int res = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[res - 1] != arr[i]) {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 20, 30, 30, 30 };

        // for (int i : arr) {
        //     System.out.println(i + " ");
        // }

        int n = remDups(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
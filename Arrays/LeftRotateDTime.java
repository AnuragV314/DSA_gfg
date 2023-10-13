// 1) Naive Approach:
// In this approach, we rotate the array by one position for D times.
// Time Complexity: O(nd)
// Space Complexity: O(1)

// public class LeftRotateDTime {
//     static void leftRotateOne(int arr[]){
//         int temp = arr[0];
//         for(int i=1; i<arr.length; i++){
//             arr[i-1] = arr[i];
//         }
//         arr[arr.length-1] = temp;
//     }

//     static void leftRotate(int arr[], int d){
//         for(int i =0; i<d; i++)
//             leftRotateOne(arr);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5}, d =2;
//         leftRotate(arr, d);
//         for (int i : arr) {
//             System.out.println(i);
//         }
//     }
// }

// 2) Better Approach:
// In this approach, we store the first D elements of the array in a new array, and shift the remaining elements by D positions to the left. Finally we copy back the D elements from the new array to the end of the original array.
// Time Complexity: Theta(n)
// Space Complexity: Theta(d)

// public class LeftRotateDTime {
//     static void leftRotate(int arr[], int d){
//         int temp[] = new int[d];
//         for(int i =0; i<d; i++)
//             temp[i] = arr[i];
        
//         for(int i = d; i < arr.length; i++)
//             arr[i-d] = arr[i];
        
//         for(int i=0; i<d; i++)
//             arr[arr.length-d+i] = temp[i];
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5}, d =2;
//         leftRotate(arr, d);
//         for (int i : arr) {
//             System.out.println(i);
//         }
//     }
// }

// 3) Reversal Approach (Efficient):
// This approach consists of 3 reversal steps:

// Reverse the elements from 0 to d-1 index
// Reverse the elements from d to n-1 index
// finally reverse the whole array

// Time Complexity: Theta(n)
// Space Complexity: Theta(1)


public class LeftRotateDTime{

    static void reverse(int arr[], int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
    static void leftRotate(int arr[], int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}, d =2;
        leftRotate(arr, d);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}


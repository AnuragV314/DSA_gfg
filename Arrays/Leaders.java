// 1) Naive Approach: 
// We use two loops in this approach. The outer loop runs from 0 to size – 1 and one by one picks all elements from left to right. The inner loop compares the picked element to all the elements on its right side. If the picked element is greater than all the elements to its right side, then the picked element is the leader. 

// Time Complexity: O(n2)
// Auxiliary Space: O(1)
// public class Leaders {
    
//     static void leader (int arr[]){
//         for(int i = 0; i<arr.length; i++){
//             boolean flag = false;
//             for(int j= i+1; j<arr.length; j++){
//                 if(arr[i]<=arr[j]){
//                     flag = true;
//                     break;
//                 }
//             }
//             if(flag==false){
//                 System.out.println(arr[i]);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {7, 10, 4, 10 , 6, 5, 2};
//         leader(arr);
//     }

// }



// 2) Efficient Approach:
// The idea is to scan all the elements from right to left in an array and keep track of the maximum till now. When the maximum changes its value, print it.

// Time Complexity: O(n)
// Auxiliary Space: O(1)

public class Leaders {
    
    static void leader (int arr[]){
        int curr_ldr = arr[arr.length-1];
        System.out.print(curr_ldr+" ");
        for(int i = arr.length-2; i>=0; i--){
            if(curr_ldr<arr[i]){
                curr_ldr = arr[i];
                System.out.print(curr_ldr+" ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 10 , 6, 5, 2};
        leader(arr);
    }

}
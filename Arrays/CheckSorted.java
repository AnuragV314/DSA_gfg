// Shorted in non-decreasing order.

// Naive appr. O(n^2)
// public class CheckSorted {
//     static boolean isSorted(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[i])
//                     return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 5, 12, 30, 2, 35 };

//         System.out.println(isSorted(arr));
//     }
// }

// Effective appr. O(n)
public class CheckSorted {
    static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println(isSorted(arr));
    }
}

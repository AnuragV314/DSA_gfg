// theta(n) TC
// theta(1) space
public class ReverseArray {
    static void reverse(int arr[]) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        reverse(arr);
        // for(int i=0; i<arr.length; i++)
        // System.out.println(arr[i]);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// or
// public class ReverseArray {
//     static void reverse(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6 };
//         reverse(arr);
//         // for(int i=0; i<arr.length; i++)
//         // System.out.println(arr[i]);

//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }

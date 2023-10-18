// public class MajorityElement {
//     static int findMajority(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             int count = 1;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j])
//                     count++;
//             }
//             if (count > (arr.length)/2)
//                 return arr[i];
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 2, 3, 2, 2 };
//         System.out.println(findMajority(arr));
//     }
// }

// method 2 eff. app.

public class MajorityElement {
    static int findMajority(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == arr[i-1])
                count++;

            if (count > (arr.length) / 2)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 2, 2 };
        System.out.println(findMajority(arr));
    }
}
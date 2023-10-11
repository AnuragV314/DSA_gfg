// Naive Approach===>

// public class SecondLargestE {
//     static int getLargest(int arr[], int n){
//         int largest = 0;
//         for(int i=1; i<n; i++)
//             if(arr[i]>arr[largest])
//                 largest = i;
//         return largest;
//     }

//     static int secondLargest(int arr[], int n){
//         int largest = getLargest(arr, n);
//         int res = -1;
//         for(int i = 0; i<n; i++){
//             if(arr[i]!=arr[largest]){
//                 if(res == -1)
//                     res = i;
//                 else if (arr[i] > arr[res])
//                     res = i;   
//             }
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         int arr[] = {3, 12, 5, 6, 8}, n = 5;
//         System.out.println(secondLargest(arr, n));

//     }
// }

 
public class SecondLargestE {
    static int secondLargest(int arr[]){
        int res=-1, largest=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;
            }
            else if (arr[i] != arr[largest]){
                if(res == -1 || arr[i]>arr[res])
                    res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3, 12, 5, 6, 8};
        System.out.println(secondLargest(arr));
    }
}
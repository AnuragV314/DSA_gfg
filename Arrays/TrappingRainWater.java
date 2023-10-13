// 1)Naive Approach 
// Complexity Analysis: 

// Time Complexity: O(n2). There are two nested loops traversing the array.
// Space Complexity: O(1). No extra space is required.


// public class TrappingRainWater {

//     static int getWater(int arr[]) {
//         int n = arr.length;
//         int res = 0;

//         for (int i = 1; i < n - 1; i++) {
//             int lMax = arr[i];
//             for (int j = 0; j < i; j++) {
//                 lMax = Math.max(lMax, arr[j]);
//             }
//             int rMax = arr[i];
//             for (int k = i + 1; k < n; k++) {
//                 rMax = Math.max(rMax, arr[k]);
//             }

//             res += Math.min(lMax, rMax) - arr[i];
//         }

//         return res;

//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 0, 2, 0, 4 };
//         System.out.println(getWater(arr));
//     }
// }

// 2) Efficient Approach
// Complexity Analysis:

// Time Complexity: O(N). Only one traversal of the array is needed, So time
// Complexity is O(N).
// Space Complexity: O(N). Two extra arrays are needed, each of size N.


public class TrappingRainWater {

    static int getWater(int arr[], int n)
    {
    	int res = 0;

    	int lMax[] = new int[n];
    	int rMax[] = new int[n];

    	lMax[0] = arr[0];
    	for(int i = 1; i < n; i++)
    		lMax[i] = Math.max(arr[i], lMax[i - 1]);


    	rMax[n - 1] = arr[n - 1];
    	for(int i = n - 2; i >= 0; i--)
    		rMax[i] = Math.max(arr[i], rMax[i + 1]);

    	for(int i = 1; i < n - 1; i++)
    		res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
    	
    	return res;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 2, 0, 4 }, n = arr.length;
        System.out.println(getWater(arr, n));
    }
}

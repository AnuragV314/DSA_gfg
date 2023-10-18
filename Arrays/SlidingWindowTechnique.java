public class SlidingWindowTechnique {
    static int maxSum(int arr[], int k){
        int res = Integer.MIN_VALUE;
        for(int i =0; i+k-1 < arr.length; i++){
            int curr= 0;
            for(int j=0; j<k; j++){
                curr += arr[i+j];
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] ={10, 5 , -2, 20, 1}, k=3; 
        System.out.println(maxSum(arr, k));
    }
}

public class SubarraywithGivenSum {
    static boolean isSubSum(int arr[], int sum){
        for(int i =0 ;i<arr.length; i++){
            int curr = 0;
            for(int j=i; j<arr.length; i++){
                curr += arr[j];
                if(curr == sum)
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,0,4,7}, sum=6;
        System.out.println(isSubSum(arr, sum));
    }
}

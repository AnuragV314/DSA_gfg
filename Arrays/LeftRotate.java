// Left Rotate an Array by One
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LeftRotate {
    static void leftRotate(int arr[]){
        int temp = arr[0];
        
        for(int i=1; i<arr.length; i++)
            arr[i-1] = arr[i];
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        int  arr[] = {1,2,3,4,5};
        leftRotate(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

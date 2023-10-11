public class PushZeroToEnd {
    static void swapA(int i, int j){
            int temp = i;
            i = j;
            j = temp;
    }

    static void pushZerosToEnd(int arr[]){
        int count = 0;
        for(int i= 0; i<arr.length;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count<arr.length)
            arr[count++] = 0;
    }   

    public static void main(String[] args) {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        pushZerosToEnd(arr);
        for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
    }
}

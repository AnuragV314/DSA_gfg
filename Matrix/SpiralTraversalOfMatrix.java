public class SpiralTraversalOfMatrix {
    static void printSpiral(int arr[][], int R, int C){
        int top=0, left=0, bottom=R-1, right=C-1;
        while(top<=bottom && left<=right){
            // Top row
            for(int i = left;i<=right; i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            System.out.println();
            // Right Column
            for(int i=top; i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            System.out.println();
            // bottom row (reverse order)
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            // left column (reverse order)
            System.out.println();
            if(left<=right){
                for(int i=bottom ; i>=top; i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};

    	printSpiral(arr, 4, 4);
    }
}

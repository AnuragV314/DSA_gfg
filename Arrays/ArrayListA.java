import java.util.*;

// ---------------------------------------------------------------
// class ArrayListA
// { 
//     static int search(int arr[], int n, int x)
//     {
//     	for(int i = 0; i < n; i++)
//     	{
//     		if(arr[i] == x)
//     			return i;
//     	}

//     	return -1;
//     } 
//     public static void main(String args[]) 
//     { 
//        int arr[] = {20, 5, 7, 25}, x = 5;

//        System.out.println(search(arr, arr.length, x));
//     } 
// }

// ---------------------------------------------------------------
// JAVA
class ArrayListA {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(10);

        System.out.println(arr.indexOf(7));
    }
}

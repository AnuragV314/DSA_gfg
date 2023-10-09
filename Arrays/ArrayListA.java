import java.util.*;

// JAVA - Search
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
// JAVA - With function - indexOf()

// class ArrayListA {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         arr.add(4);
//         arr.add(5);
//         arr.add(6);
//         arr.add(7);
//         arr.add(8);
//         arr.add(10);

//         System.out.println(arr.indexOf(7));
//     }
// }

// ---------------------------------------------------------------
// ---------------------------------------------------------------
// JAVA - Insert  
// -simple

// class ArrayListA {

//     static int insert(int arr[], int n, int x, int cap, int pos) {
//         if (n == cap)
//             return n;

//         int idx = pos - 1;

//         for (int i = n - 1; i >= idx; i--) {
//             arr[i + 1] = arr[i];
//         }

//         arr[idx] = x;

//         return n + 1;
//     }

//     public static void main(String args[]) {
//         int arr[] = new int[5], cap = 5, n = 3;

//         arr[0] = 5;
//         arr[1] = 10;
//         arr[2] = 20;

//         System.out.println("Before Insertion");

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();

//         int x = 7, pos = 2;

//         n = insert(arr, n, x, cap, pos);

//         System.out.println("After Insertion");

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

// }

// ---------------------------------------------------------------
// - with Function - add(position , value)

// class ArrayListA {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         arr.add(4);
//         arr.add(5);
//         arr.add(8);

//         arr.add(1 , 100);

//         for(int i:arr){
//             System.out.println(i);
//         };
//     }
// }

// ---------------------------------------------------------------
// ---------------------------------------------------------------
// JAVA - Delete  
// -simple

// class ArrayListA {
//     static int deleteEle(int arr[], int n, int x) {
//         int i;
//         for (i = 0; i < n; i++)
//             if (arr[i] == x)
//                 break;
//         if (i == n)
//             return n;
//         for (int j = i; j < n - 1; j++)
//             arr[j] = arr[j + 1];
//         return n - 1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {3, 8, 12, 5, 6}, x = 12, n = 5;
//         n = deleteEle(arr, n, x);
//         for(int i=0; i < n; i++)
//        		System.out.print(arr[i]+" ");
       
//     }
// }

// ---------------------------------------------------------------
// - with Function - remove()

class ArrayListA {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
       arr.add(12);
       arr.add(125);
       arr.add(142);
       arr.add(129);

       arr.remove(0);

        
        for(int i:arr){
            System.out.println(i);
        };
    }
}


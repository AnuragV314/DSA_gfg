import java.util.*;

// -with function--> Collections.max()
// public class LargestNo {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         arr.add(14);
//         arr.add(2);
//         arr.add(73);

//         System.out.println(Collections.max(arr));
//     }
// }

// -- simple
public class LargestNo{
    public static void main(String[] args) {
        int arr[] = {10, 324, 45, 90, 9808}; 
        int max = arr[0];

        for(int i = 1; i< arr.length; i++)
            if(arr[i]>max)
                max = arr[i];
        
        System.out.println(max);
    }
}
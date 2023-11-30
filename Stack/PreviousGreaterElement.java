import java.util.*;

public class PreviousGreaterElement {
    static void printPrevGreater(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        s.add(0);
        for (int i = 0; i < n; i++) {
            while (s.isEmpty() == false && s.peek() <= arr[i])
                s.pop();
            int pg = s.isEmpty() ? -1 : s.peek();
            System.out.println(pg + " ");
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 20, 30, 10, 5, 15 };

        printPrevGreater(arr, arr.length);
    }
}

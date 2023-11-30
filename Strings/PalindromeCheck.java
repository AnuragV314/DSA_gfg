import java.util.Scanner;
// O(n) 
public class PalindromeCheck {
    static boolean isPalindrome(String str){
        int left = 0, right =str.length()-1;

        while (left<right) {
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println(str+" is a palindrome.");
        }
        else{
            System.out.println(str+" is not a palindrome.");
        }
    }
    
}


// also you can use reverse() func.
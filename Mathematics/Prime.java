public class Prime {
    // Method 1
    static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Method 2 (best method)
    static boolean isPrime1(int n) {
        if (n == 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Method 3
    static boolean findPrime(int n) {
        for (int i = 0; i * i <= n; i++) {
            if ((6 * i + 1) == n || (6 * i - 1) == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPrime(number));
        System.out.println(isPrime1(number));
        System.out.println(findPrime(number));
    }
}

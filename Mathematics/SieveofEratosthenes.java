public class SieveofEratosthenes {

    static boolean isPrime(int n) {
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

    // Naive Solution
    static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    // Sieve of Eratosthenes
    


    public static void main(String[] args) {
        printPrime(10);
    }
}

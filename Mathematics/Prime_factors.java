class Prime_factor {
    static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i < n; i = i + 6) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Method 1 (Naive)
    static void primeFactor(int p) {
        for (int i = 2; i < p; i++) {
            if (isPrime(i)) {
                int x = i;
                while (p % x == 0) {
                    System.out.println(i);
                    x = x * i;
                }
            }
        }
    }

    // Method 2 (Efficient)
    static void primeFactor1(int p) {
        if (p <= 1)
            return;
        for (int i = 2; i * i <= p; i++) {
            while (p % i == 0) {
                System.out.println(i);
                p = p / i;
            }
        }
        if (p > 1)
            System.out.println(p);
    }

    // Method 3 (More Efficient)
    static void primeFactor2(int p) {
        if (p <= 1)
            return;
        while (p % 2 == 0) {
            System.out.println(2);
            p = p / 2;
        }
        while (p % 3 == 0) {
            System.out.println(3);
            p = p / 3;
        }

        for (int i = 5; i * i <= p; i = i + 6) {
            while (p % i == 0) {
                System.out.println(i);
                p = p / i;
            }

            while (p % (i + 2) == 0) {
                System.out.println(i + 2);
                p = p / (i + 2);
            }
        }

        if (p > 3)
            System.out.println(p);
    }

    public static void main(String[] args) {
        // primeFactor(12);
        // primeFactor1(450);
        primeFactor2(315);

    }
}
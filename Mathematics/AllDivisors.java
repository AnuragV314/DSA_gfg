class AllDivisors {

    // Naive approach
    static void allDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    // Efficient approach

    static void allDivisors1(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

                if (i != n / i) {
                    System.out.println(n / i);
                }
            }

        }
    }

    // More Efficient approach

    static void allDivisors2(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }

        }
        for (; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("hello dost...");
        allDivisors1(15);
    }
}
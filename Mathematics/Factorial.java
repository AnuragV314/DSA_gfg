public class Factorial {
    // Recursive Code ==>
    // static int fact(int n) {
    //     if (n == 0 || n == 1)
    //         return 1;
    //     return n * fact(n - 1);
    // }

    // or 
    static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }


    // Iterative Code===>

    // static int fact1(int n) {
    //     int facOfNumber = 1;
    //     for (int i = 0; i <= n; i++) {
    //         if (i == 0 || i == 1)
    //             facOfNumber = 1;
    //         facOfNumber = facOfNumber * i;
    //     }
    //     return facOfNumber;
    // }

    // or 
    static int fact1(int n) {
        int facOfNumber = 1;
        for (int i = 2; i <= n; i++) {
            facOfNumber = facOfNumber * i;
        }
        return facOfNumber;
    }

    public static void main(String[] args) {
        int numebr = 5;
        System.out.println(fact(numebr));

        System.out.println(fact1(numebr));
    }
}


// TC ==> theta(n)

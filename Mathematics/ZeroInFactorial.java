public class ZeroInFactorial {

    // Causes Overflow problem-->
    // static int countZero(int n) {
    // int fact = 1;
    // for (int i = 2; i <= n; i++)
    // fact = fact * i;
    // int c = 0;
    // while(fact%10 == 0){
    // c++;
    // fact = fact/10;
    // }
    // return c;

    // }

    // Efficient solution-->
    static int countZero(int n) {
        int c = 0;
        for (int i = 5; i <= n; i = i * 5) {
            c = c + (n / i);
        }
        return c;

    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(countZero(num));
    }
}

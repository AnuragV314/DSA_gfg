package BitMagic;

/**
 * BitwiseOperator
 */
public class BitwiseOperator {

    public static void main(String[] args) {

        // Find the Binary Number
        /*
         * int n=10;
         * while(n>0){
         * if(n%2!=0){
         * System.out.print(1);
         * }
         * else{
         * System.out.print(0);
         * }
         * n = n/2;
         * }
         */

        // Bitwise Operator
        int x = 3, y = 6;
        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);

        System.out.println(~x); // (2's) -x = 2^32-x

        System.out.println(x << 2); // x*2^y

        System.out.println(x >> 1);

        int z = -2;
        System.out.println(z >>> 2);
    }
}
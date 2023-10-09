
// absolute value
/* 
public class problems {
    public static void main(String[] args) {
        int x = -13;
        System.out.println(x*(-1));
    }
}
*/

// Find root of the Quadratic Equation

class problems {

    public static void main(String[] args) {
        double a = 1, b = -2, c = 1;
        double root1, root2;

        double determinent = b * b - 4 * a * c;

        if (determinent > 0) {
            root1 = (-b + Math.sqrt(determinent)) / (2 * a);
            root2 = (-b - Math.sqrt(determinent)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        } else if (determinent == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinent) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}

public class LCM {
    static int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b, a%b) ;   
    }

    static int lcm(int a, int b){
        return (a*b)/ gcd(a, b);
    }
    public static void main(String[] args) {
        int a= 15, b = 20;
        System.out.println(lcm(a, b));
    }
}

public class ComputingPower {
    static int power(int x, int n){
        int result = 1;
        while(n != 0){
            result *= x;
            n--;
        }
        return result;
    }

    // or

    static int power1(int x, int n){
        int result = 1;
        for(int i=0;i<n;i++){
            result *= x;
        }
        return result;
    }


    public static void main(String[] args) {
        
        // System.out.println(power(2, 3));
        System.out.println(power1(2, 3));
    }
}

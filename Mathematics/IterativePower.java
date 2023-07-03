public class IterativePower {
    public static void main(String[] args) {
        // int n=10;
        // while(n>0){
        //     if(n%2!=0){
        //         System.out.print(1);
        //     }
        //     else{
        //         System.out.print(0);
        //     }
        //     n = n/2;
        // }



        int x = 2;
        int n = 3;
        int result = 1;
        while(n>0){
            if((n&1) ==1){
                result *= x;
            }
            x = x*x;
            n = n>>1;
        }
        System.out.println(result);
    }
}

class CountDigit{

    static int countDigit(int n){
        int res = 0;
        while (n>0){
            n = n/10;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int number = 789;
        System.out.println(countDigit(number));
    }
}


// TC --- theta(d)
class Main {
    // base^power using recursion
    static int exp(int base, int power){
        if(power == 0){
            return 1;
        } else {
            return base * exp(base, power - 1);
        }
    }
    
    public static void main(String[] args) {
        int result = exp(2, 5);
        System.out.println("exp(2,5) = " + result);
    }
}
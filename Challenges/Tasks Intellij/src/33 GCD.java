class GCD {
    public static void main(String[] args) {
        int catchAnswer = findGCD(15, 30);
        System.out.println(catchAnswer + "\n");
        int catchAnswer1 = findGCD(5, 7);
        System.out.println(catchAnswer1 + "\n");
    }
    public static int findGCD(int divisor, int dividend){
        int ans;
        while(divisor != 0){
            ans = dividend % divisor;
            dividend = divisor;
            divisor = ans;

        }
        return dividend;
    }
}

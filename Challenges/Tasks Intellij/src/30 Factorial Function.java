class Factorial {
    public static void main(String[] args) {
        long catchAnswer = numFactorial(25);
        System.out.println(catchAnswer);

    }
    public static long numFactorial(int num){
        long mul = 1;
        long startNum = 1;
        while(startNum <= num){
            mul = mul * startNum;
            startNum++;
        }
        return mul;
    }
}

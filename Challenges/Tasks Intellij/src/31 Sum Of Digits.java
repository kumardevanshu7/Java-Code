class SumOfDigits {
    public static void main(String[] args) {
        int catchAnswer = sumOfDigits(123456);
        System.out.println(catchAnswer);

    }

    public static int sumOfDigits(int number){
        int sum = 0;
        while(number != 0){
            int oneDigit = number % 10;
            sum = sum + oneDigit;
            number = number / 10;
        }
        return sum;
    }
}

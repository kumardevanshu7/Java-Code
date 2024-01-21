class ReverseDigit {
    public static void main(String[] args) {
        System.out.println(reverseDigit(250));
        System.out.println(reverseDigit(253));
        System.out.println(reverseDigit(2543));
        System.out.println(reverseDigit(643));

    }

    public static int reverseDigit(int num){
        int sum = 0;
        int mul = 10;
        int digit;
        while(num != 0){
            digit = num % 10;
            num = num / 10;
            sum += digit;
            if(num != 0){
                sum *= mul;
            }
        }
        return sum;
    }
}

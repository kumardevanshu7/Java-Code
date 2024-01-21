class Palindrome {
    public static void main(String[] args) {
        isPalindrome(5678);
        isPalindrome(32123);
        isPalindrome(44444);
        isPalindrome(6776);

    }

    public static void isPalindrome(int num){
        if(reverseNumber(num) ==  num){
            System.out.println("Its A Palindrome Number");
        } else{
            System.out.println("Its Not A Palindrome Number");
        }
    }
    public static int reverseNumber(int num){
        int digit, mul = 10, sum = 0;
        while(num != 0){
            digit = num % 10;
            sum += digit;
            num = num / 10;
            if(num != 0){
                sum *= mul;
            }
        }
        return sum;
    }
}

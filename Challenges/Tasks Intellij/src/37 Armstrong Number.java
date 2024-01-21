class ArmstrongNumber {
    public static void main(String[] args) {

        printAnswer(1);
        printAnswer(371);
        printAnswer(153);
        printAnswer(123);

    }

    public static void printAnswer(int num){
        if(checkArmstrongNumber(num) == num){
            System.out.println("This Number " + num + " is a Armstrong Number.");
        } else {
            System.out.println("This Number " + num + " is not a Armstrong Number.");
        }
    }

    public static int countNum(int num){
        int count = 0, digit;
        while(num != 0){
            digit = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }
    public static double checkArmstrongNumber(int num){
            double realNum = num, ans, sum = 0;
            while(num != 0){
                ans = num % 10;
                sum += Math.pow(ans, countNum((int)realNum));
                num /= 10;
            }
            return (int)sum;
    }
}

import java.util.Scanner;

class SumTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNum = sc.nextInt();
        System.out.println("Sum is: " + (firstNum + secondNum));
    }
}

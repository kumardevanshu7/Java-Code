import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doing BITWISE AND Operator");
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.println("Processing...");

        int result = num1 & num2;
        System.out.println("Answer is: " + result);
        System.out.println("DONE!");

    }
}

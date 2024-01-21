import java.util.Scanner;

class BitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doing BITWISE XOR Operator \n");
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.println("Processing...");

        // ^ - cap
        int result = num1 ^ num2;
        System.out.println("Answer is: " + result);
        System.out.println("DONE!");

    }
}

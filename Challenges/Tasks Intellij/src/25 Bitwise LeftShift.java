import java.util.Scanner;

class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Doing BITWISE Left-Shift Operator \n");

        System.out.print("Enter Number: ");
        int num1 = input.nextInt();

        System.out.println("Processing...");

        int result = num1 << 7;
        System.out.println("Answer is: " + result);
        System.out.println("DONE!");

    }
}

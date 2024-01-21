import java.util.Scanner;

class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Doing BITWISE Right-Shift Operator \n");

        System.out.print("Enter Number: ");
        int num1 = input.nextInt();

        System.out.println("Processing...");

        int result = num1 >> 1;
        System.out.println("Answer is: " + result);
        System.out.println("DONE!");

    }
}

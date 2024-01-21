import java.util.Scanner;

class BitwiseNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Bitwise Not also known as Compliment
        System.out.println("Doing BITWISE NOT Operator \n");

        System.out.print("Enter Number: ");
        int num1 = input.nextInt();

        System.out.println("Processing...");

        // ~ --> tilda sign
        int result = ~num1;
        System.out.println("Answer is: " + result);
        System.out.println("DONE!");

    }
}

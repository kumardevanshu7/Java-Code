import java.util.Scanner;

class AllArithmeticOperations {
    public static void main(String[] args) {
        // Ques: Take two numbers and show all arithmetic operations
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter 1st Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        num2 = sc.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Sub: " + (num1 - num2));
        System.out.println("Mul: " + (num1 * num2));
        System.out.println("Div: " + (num1 / num2));
        System.out.println("Mod: " + (num1 % num2));
    }
}

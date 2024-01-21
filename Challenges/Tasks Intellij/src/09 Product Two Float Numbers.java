import java.util.Scanner;

class ProductTwoFloatNumbers {
    public static void main(String[] args) {
        // Ques: Product of two floating points numbers
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.print("Enter a 1st Floating Points: ");
        num1 = sc.nextDouble();
        System.out.print("Enter a 2nd Floating Points: ");
        num2 = sc.nextDouble();

        System.out.println("Processing...");
        System.out.println("Mul: " + (num1 * num2));
        System.out.println("Done!");

    }
}

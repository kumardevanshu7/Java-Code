import java.util.Scanner;

class ThreeNumbersLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all three different Numbers...");
        int num1, num2, num3;
        System.out.print("Enter 1st Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        num2 = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        num3 = sc.nextInt();

        System.out.println("Identifying which number is Greater...\n\n");

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number " + num1 + " is GREATER!");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number " + num2 + " is GREATER!");
        } else {
            System.out.println("Number " + num3 + " is GREATER!");
        }
    }
}

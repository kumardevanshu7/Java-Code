import java.util.Scanner;

class numberIsPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        System.out.println("Identifying the nature of Number...");
        if (num == 0) {
            System.out.println("Number is Zero!");
        } else if (num > 0) {
            System.out.println("Number is Positive!");
        } else {
            System.out.println("Number is Negative!");
        }
    }
}

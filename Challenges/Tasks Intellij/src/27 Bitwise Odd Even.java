import java.util.Scanner;

class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Doing BITWISE Odd Even Checker \n");

        System.out.print("Enter Number: ");
        int num = input.nextInt();

        System.out.println("Processing...");

        if((num & 1) == 1){
            System.out.println(num + " is a Odd Number!");
        } else {
            System.out.println(num + " is a Even Number!");
        }
        System.out.println("DONE!");

    }
}

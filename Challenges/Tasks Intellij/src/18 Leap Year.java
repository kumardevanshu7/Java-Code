import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Year: ");
        int num = sc.nextInt();

        System.out.println("Processing...");

        if(num % 400 == 0 || (num % 4 == 0 && num % 100 != 0)){
            System.out.println(num + " is a Leap Year!");
        } else {
            System.out.println(num + " is not a Leap Year!");
        }
    }
}

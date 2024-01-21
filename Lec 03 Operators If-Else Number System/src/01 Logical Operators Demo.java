import java.util.Scanner;

class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println("Are you a Female? (true/false)");
        boolean isFemale = sc.nextBoolean();

        if(age < 5){
            System.out.println("You got 75% Discount!");
        } else if (isFemale){
            System.out.println("You got 50% Discount!");
        } else if(age > 60 && !isFemale){
            System.out.println("You got 25% Discount!");
        } else {
            System.out.println("You got no Discount");
        }
    }
}

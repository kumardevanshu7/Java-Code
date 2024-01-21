import java.util.Scanner;

class GradesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check your marks GRADE here!");
        System.out.print("Enter your Marks (0 - 100): ");
        int marks = input.nextInt();

        System.out.println("Processing...");

        if(marks >= 90){
            System.out.println("Your Grade is A" + " (" + marks + ")");
        } else if (marks >= 75){
            System.out.println("Your Grade is B" + " (" + marks + ")");
        } else if (marks >=60){
            System.out.println("Your Grade is C" + " (" + marks + ")");
        } else if (marks >= 30){
            System.out.println("Your Grade is D" + " (" + marks + ")");
        } else {
            System.out.println("Your Grade is F because your marks is less than 30 that is " + "\"" + marks + "\"" + ".");
        }
        System.out.println("Done...");


    }
}

import java.util.Scanner;

class CategoryAgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check your Age Category");

        System.out.print("Enter your current age: ");
        int age = input.nextInt();

        System.out.println("Processing...");

        if(age >= 60){
            System.out.println("You are Senior...");
        } else if(age >= 20){
            System.out.println("You are An Adult...");
        } else if(age >= 13){
            System.out.println("You are a Teen Kiddo...");
        } else {
            System.out.println("You are a Child means Bachah HAHAHA...");
        }

        System.out.println("DONE!");

    }
}

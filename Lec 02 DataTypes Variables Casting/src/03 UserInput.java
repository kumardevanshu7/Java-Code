import java.util.Scanner;
class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print(name + ", please also write your age in number: ");
        int age = input.nextInt();
        System.out.println("Name: " + name + "\n" + "Age: " + age);
    }
}

import java.util.Scanner;

class NameScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.next();
        System.out.println("Welcome " + name + " to My World");
    }
}

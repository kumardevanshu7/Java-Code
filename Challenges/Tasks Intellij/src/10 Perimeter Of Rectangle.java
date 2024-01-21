import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of All Sides...");
        double A, B, C, D;
        System.out.print("A -> ");
        A = sc.nextDouble();
        System.out.print("B -> ");
        B = sc.nextDouble();
        System.out.print("C -> ");
        C = sc.nextDouble();
        System.out.print("D -> ");
        D = sc.nextDouble();
        System.out.println("Calculating Rectangle Perimeter... ");
        System.out.println("Processing... ");
        System.out.println("Answer: " + (A + B + C + D));
        System.out.println("Done!");
    }
}

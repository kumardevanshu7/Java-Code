import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of Base & Height...");
        double base, height;
        System.out.print("Base -> ");
        base = sc.nextDouble();
        System.out.print("Height -> ");
        height = sc.nextDouble();
        System.out.println("Calculating Area of Triangle... ");
        System.out.println("Processing... ");
        System.out.println("Answer: " + (0.5 * (base * height)));
        System.out.println("Done!");
    }
}

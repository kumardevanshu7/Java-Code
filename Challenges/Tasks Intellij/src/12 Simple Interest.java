import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of Principal, ROI & Time...");
        int Principal;
        System.out.print("Principal -> ");
        Principal = sc.nextInt();
        System.out.print("ROI -> ");
        float ROI = sc.nextFloat();
        System.out.print("Time -> ");
        float Time = sc.nextFloat();
        System.out.println("Calculating Simple Interest... ");
        System.out.println("Processing... ");
        double result = (Principal * ROI * Time) / 100;
        System.out.println("Answer: " + result); // doubt
        System.out.println("Done!");
    }
}

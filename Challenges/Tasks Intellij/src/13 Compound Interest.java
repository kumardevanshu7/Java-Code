import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of Principal, ROI & Time...");
        double Principal, ROI, Time;
        System.out.print("Principal -> ");
        Principal = sc.nextDouble();
        System.out.print("ROI -> ");
        ROI = sc.nextDouble();
        System.out.print("Time -> ");
        Time = sc.nextDouble();
        System.out.println("Calculating Compound Interest... ");
        System.out.println("Processing... ");
        double result = Principal * Math.pow((1 + ROI / 100), Time);
        System.out.println("Answer: " + result); // doubt
        System.out.println("Done!");
    }
}

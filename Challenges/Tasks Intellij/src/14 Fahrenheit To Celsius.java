import java.util.Scanner;

class FehToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter ON...");
        double fah;
        System.out.print("Fahrenheit Temp... -> ");
        fah = sc.nextDouble();
        System.out.println("Calculating Temperature... ");
        double cel = ((fah - 32) * 5)/9;
        System.out.println("Answer: " + cel); // doubt
        System.out.println("Done!");
    }
}

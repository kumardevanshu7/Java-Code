class SwapNums {
    public static void main(String[] args) {
        // Question 07 : Create a program to swap two numbers.
        int num1 = 17;
        int num2 = 30;
        System.out.println("First Number: " + num1 + "\n" + "Second Number: " + num2);

        System.out.println();

        // Swap Process
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("First Number: " + num1 + "\n" + "Second Number: " + num2);
    }
}

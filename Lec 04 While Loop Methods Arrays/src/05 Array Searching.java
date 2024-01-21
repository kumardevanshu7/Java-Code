import java.util.Scanner;

class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 6, 8, 87, 65, 4, 68, 23, 9, 98, 34};
        System.out.println("Welcome to Array Searching \n");

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("Found It...");
        } else {
            System.out.println("Not Found...");
        }
    }

    public static boolean isFound(int[] arr, int num){
        int idx = 0;
        while(idx < arr.length){
            if(arr[idx] == num){
                return true;
            }
            idx ++;
        }
        return false;
    }
}

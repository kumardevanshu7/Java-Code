import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputAray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Enter the first element in " + i + " index: ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static void printInfo(int[] arr){
        int idx = 0;
        System.out.println("Arrays: ");
        while(idx < arr.length){
            System.out.print(arr[idx] + " ");
            idx++;
        }
        System.out.println();
    }

    public static int takeOneNumberInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int num = input.nextInt();
        return num;
    }

    public static int[][] input2dArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int row = input.nextInt();
        System.out.print("Enter number of Columns: ");
        int columns = input.nextInt();
        int[][] twoArray = new int[row][columns];

        int i = 0;
        while(i < row){
            int j = 0;
            while(j < columns){
                System.out.print("Enter the number in row " + i + " and column " + j + ": ");
                twoArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        return twoArray;
    }

    public static void print2dArray(int[][] arr){
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}


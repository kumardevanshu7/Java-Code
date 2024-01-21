class SumAndAverage {
    public static void main(String[] args) {
        // my way
//        int[] arr = {1, 2, 3, 4, 5};
//        int sumOfNumbers = sum(arr);
//        System.out.println(sumOfNumbers);
//        int avgOfNumbers = average(arr);
//        System.out.println(avgOfNumbers);

        // sir way
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the size of an Array: ");
//        int size = input.nextInt();
//        int[] arr = new int[size];
//        int i = 0;
//        while(i < size){
//            System.out.println("Enter the first element in " + i + " index: ");
//            arr[i] = input.nextInt();
//            i++;
//        } // this all input array tranfers at the UtilityOfArray

        int[] newArr = ArrayUtility.inputAray();
        ArrayUtility.printInfo(newArr);
        System.out.println();
        int sum = sum(newArr);
        System.out.println("Sum is: " + sum);
        int avg = average(newArr);
        System.out.println("Average is: " + avg);


    }
    public static int sum(int[] arr){
        int result = 0;
        int sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }
    public static int average(int[] arr){
        int sum = sum(arr);
        int avg = sum / arr.length;
        return avg;
    }
}

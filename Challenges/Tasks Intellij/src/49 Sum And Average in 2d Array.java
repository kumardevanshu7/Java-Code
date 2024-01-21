class SumAndAverageIn2dArray {

    public static void main(String[] args) {

        int[][] arr = ArrayUtility.input2dArray();
        ArrayUtility.print2dArray(arr);
        System.out.println("Count is: " + count(arr));
        System.out.println("Sum is : " + sumNumbers(arr));
        System.out.println("Average is: " + averageNumber(arr));

    }

    public static int sumNumbers(int[][] arr){
        int sum = 0; // called Accumalator Pattern


        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }

        return sum;
    }

    public static long count(int[][] arr){
        int count = 0;

        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                count++;
                j++;
            }
            i++;
        }

        return count;
    }
    public static double averageNumber(int[][] arr){
        return (double)(sumNumbers(arr) / count(arr));
    }
}

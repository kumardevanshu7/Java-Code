class SumOfDiagonalElements {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2dArray();
        ArrayUtility.print2dArray(arr);
        System.out.println("Sum of Diagonal is: " + sumOfDiagonals(arr));
    }

    public static long leftDiagonalSum(int[][] arr){
        long leftSum = 0;

        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                if(i == j){
                    leftSum += arr[i][j];
                }
                j++;
            }
            i++;
        }
        return leftSum;
    }

    public static long rightDiagonalSum(int[][] arr){
        long rightSum = 0;
        int i = 0;
        while(i < arr.length){
            int col = arr.length - 1 - i;
            rightSum += arr[i][col];
            i++;
        }
        return rightSum;
    }

    public static long sumOfDiagonals(int[][] arr){
        long leftSum = leftDiagonalSum(arr);
        long rightSum = leftDiagonalSum(arr);
        long sum = leftSum + rightSum;
        if(arr.length % 2 != 0){
            int idx = arr.length / 2;
            sum -= arr[idx][idx];
        }
        return sum;
    }
}

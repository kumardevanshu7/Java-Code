class MaxNumberArray {
    public static void main(String[] args) {

        int[] arr = ArrayUtility.inputAray();
        ArrayUtility.printInfo(arr);
        int maxNum = maxInArray(arr);
        System.out.println("Max Number is: " + maxNum);
        int minNum = minInArray(arr);
        System.out.println("Min Number is: " + minNum);
    }

    public static int maxInArray(int[] arr){
        int max = arr[0];
        int i = 0;
        while(i < arr.length - 1){
            if(arr[i + 1] > max){
                max = arr[i+1];
            }
            i++;
        }
        return max;
    }
    public static int minInArray(int[] arr){
        int min = arr[0];
        int i = 0;
        while(i < arr.length - 1){
            if(arr[i + 1] < min){
                min = arr[i+1];
            }
            i++;
        }
        return min;
    }
}

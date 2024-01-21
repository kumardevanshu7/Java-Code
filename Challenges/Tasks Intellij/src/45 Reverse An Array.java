class ReverseArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputAray();
        ArrayUtility.printInfo(arr);
        reverseArray(arr);
    }
    public static void reverseArray(int[] arr){
        int startIdx = 0;
        int endIdx = arr.length - 1;
        int temp;
        while(startIdx < endIdx){
            temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;

            startIdx++;
            endIdx--;
        }
        System.out.println("Reverse Array is: ");
        ArrayUtility.printInfo(arr);
    }
}

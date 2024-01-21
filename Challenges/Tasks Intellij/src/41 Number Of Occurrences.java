class NumberOfOccurrences {
    public static void main(String[] args) {

        int[] newArr = ArrayUtility.inputAray();
        ArrayUtility.printInfo(newArr);
        int num = 2;
        int counterOfNumber = counterOfSameNumber(newArr, num);
        System.out.println();
        System.out.println("Counts of " + num + " are: " + counterOfNumber);


    }

    public static int counterOfSameNumber(int[] arr, int num){
        int count = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                count++;
            }
            i++;
        }
        return count;
    }
}

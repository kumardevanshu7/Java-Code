class DeleteElement {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputAray();
        int num = ArrayUtility.takeOneNumberInput();
        ArrayUtility.printInfo(newArray(arr, num));

    }
    public static int numOccurrences(int[] arr, int num){
        int count = 0;
        int i = 0;
        while (i < arr.length){
            if(arr[i] == num){
                count++;
            }
            i++;
        }
        return count;
    }

    public static int[] newArray(int [] arr, int num){
        int[] newArr = new int[arr.length - numOccurrences(arr, num)];
        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(arr[i] != num){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}

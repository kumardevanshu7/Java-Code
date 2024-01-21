class IsSortedOrNot {
    public static void main(String[] args) {

        int[] arr = ArrayUtility.inputAray();
        ArrayUtility.printInfo(arr);
        boolean isAscending = isSortedInAscending(arr);
        boolean isDescending = isSortedInDescending(arr);

        // my way
        if(isAscending){
            System.out.println("Array is sorted in Ascending");
        } else if(isDescending){
            System.out.println("Array is sorted in Descending");
        } else {
            System.out.println("This arrays values are Jumbled...");
        }
    }

    public static boolean isSortedInAscending(int[] arr){

        int i = 0;
        while(i < arr.length - 1){
            if(arr[i] > arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isSortedInDescending(int[] arr){

        int i = 0;
        while(i < arr.length - 1){
            if(arr[i] < arr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}

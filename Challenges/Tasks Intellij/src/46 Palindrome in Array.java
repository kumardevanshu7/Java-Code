class PalindromeArray {

    public static void main(String[] args) {
        int [] arr = ArrayUtility.inputAray();

        if(isPalindrome(arr)){
            ArrayUtility.printInfo(arr);
            System.out.println("Array Is A Palindrome!");
        } else{
            ArrayUtility.printInfo(arr);
            System.out.println("Array Is Not A Palindrome!");
        }


    }

    public static boolean isPalindrome(int[] arr) {
        int startIdx = 0;
        int endIdx = arr.length - 1;
        int i = 0;
        while(startIdx < endIdx){
            if(arr[startIdx] != arr[endIdx]){
                return false;
            }
            startIdx++;
            endIdx--;
        }
        return true;
    }
}

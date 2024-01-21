class SearchIn2dArray {

    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2dArray();
        ArrayUtility.print2dArray(arr);

        if(searchIn2dArray(arr, 8)){
            System.out.println("Number Found!");
        } else {
            System.out.println("Number Not Found!");
        }
    }

    public static boolean searchIn2dArray(int[][] arr, int num){
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                if(arr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}

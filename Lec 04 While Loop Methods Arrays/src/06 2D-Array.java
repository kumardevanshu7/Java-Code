class TwoDArray {
    public static void main(String[] args) {
//        int[][] arr = {{}};
//        System.out.println(arr.length);


//        int[][] newArr =new int[2][3];
          int[][] newArr = {{1, 2, 3}, {4, 5}, {7, 8, 9}}; // heterogeneous array
          int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // homogeneous array
//        System.out.println(arr[0].length);

        // how to traversal in 2D Array
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){ // don't write arr[0].length becuz it shows exception OutOfBound
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

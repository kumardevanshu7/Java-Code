class Array {
    public static void main(String[] args) {
        // first way to create An Array
//        int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[3] = 65;
//        myArr[1] = 2;
//        myArr[2] = 8;
//        myArr[4] = 37;

        // second way to create An Array
        int[] myArr = {98, 2, 8, 65, 37};

        // first way to print array values
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        // second way to print array values or array traversal
        int idx = 0;
        while(idx < myArr.length){
            System.out.print(myArr[idx] + " ");
            idx++;
        }
        System.out.println();

        // How to String Array
        String[] strArr = new String[4];
        strArr[0] = "Deepu";

        String[] newStrArr = {"Eva", "Chic", "Chini"};
        System.out.println(newStrArr.length);
    }
}

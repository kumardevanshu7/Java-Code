 class Merge2SortedArrays {
     public static void main(String[] args) {
//         int[] arr01 = {1, 2, 3, 4, 5};
//         int[] arr02 = {6, 12, 13, 14, 15};
         int[] arr01 = ArrayUtility.inputAray();
         int[] arr02 = ArrayUtility.inputAray();
         int[] newArray = merge2SortArrays(arr01, arr02);
         ArrayUtility.printInfo(newArray);

     }

     public static int[] merge2SortArrays(int[] arr01, int[] arr02){
         int newSize = arr01.length + arr02.length;
         int[] newArr = new int[newSize];

         int i = 0, j = 0, k = 0;

         while(i < arr01.length && j < arr02.length){
             if(arr01[i] < arr02[j]){
                 newArr[k] = arr01[i];
                 i++;
             } else {
                 newArr[k] = arr02[j];
                 j++;
             }
             k++;
         }

         // for remaining elements
         while(i < arr01.length){
             newArr[k] = arr01[i];
             i++;
             k++;
         }
         while(j < arr02.length){
             newArr[k] = arr02[j];
             j++;
             k++;
         }

         return newArr;
     }
}

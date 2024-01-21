 class FibonacciSeries {
     public static void main(String[] args) {
        printFibo(200);
     }

     public static void printFibo(int endNum){
         int first = 0, second = 1;
         int sum = 0;
         System.out.print(first + " ");
         System.out.print(second + " ");
         while(first + second <= endNum){
             sum = first + second;
             System.out.print(sum + " ");

             // swap
             first = second;
             second = sum;

         }
     }
}

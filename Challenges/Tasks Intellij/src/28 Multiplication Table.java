class Multiplication {
    public static void main(String[] args) {

        printTable(2);
        printTable(4683);
        printTable(5);

    }

    public static void printTable(int num){
        int start = 1;
        int end = 10;
        while(start <= end){
            System.out.println(num + " x " + start + " = " + (num*start));
            start++;
        }
        System.out.println();
    }
}

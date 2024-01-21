class PrimeNumber {
    public static void main(String[] args) {

        printAnswer(25);
        printAnswer(23);
    }

    public static void printAnswer(int num){
        if(findPrimeNumber(num)){
            System.out.println("Yes, " + num + " Its a Prime Number.");
        } else {
            System.out.println("No, " + num + " Its not a Prime Number.");
        }
        System.out.println();
    }
    public static boolean findPrimeNumber(int number){
        int startNum = 2;
        while (startNum < number){
            if(number % startNum == 0){
                return false;
            }
            startNum++;
        }
        return true;
    }
}

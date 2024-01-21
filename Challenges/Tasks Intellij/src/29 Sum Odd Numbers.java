class SumOddNumbers {

    public static void main(String[] args) {
        int ans = sumOfAllOddNumbers(7);
        System.out.println(ans);

    }

    public static int sumOfAllOddNumbers(int endNum){
        int sum = 0;
        int startNum = 1;
        while(startNum <= endNum){
            if(startNum % 2 != 0){
                sum = sum + startNum;
            }
            startNum++;
        }

        return sum;
    }
}

class LCM {
    public static void main(String[] args) {
        int catchAnswer = findLCM(50,40);
        System.out.println(catchAnswer);
    }

    public static int findLCM(int first, int second){
        int endNum = first * second;
        if(first > second){
            int startNum = second;
            while(startNum <= endNum){
                if(startNum % first == 0 && startNum % second == 0){
                    return startNum;
                }
                startNum++;
            }
        } else{
            int startNum = first;
            while(startNum <= endNum){
                if(startNum % first == 0 && startNum % second == 0){
                    return startNum;
                }
                startNum++;
            }
        }
        return 0;
    }
}

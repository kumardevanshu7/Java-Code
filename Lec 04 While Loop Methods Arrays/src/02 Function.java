class Function {
    public static void main(String[] args) {
        patternOne();
        patternTwo();

    }
    public static void patternOne(){
        int row = 1;
        int star = 1;
        while(row <= 5){
            // for star
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }

            // updation value
            System.out.println();
            row++;
            star++;
        }
    }
    public static void patternTwo(){
        int row = 1;
        int star = 5;
        while(row <= 5) {
            // for star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            // updation value
            star--;
            row++;
            System.out.println();
        }
    }
}

import java.util.Scanner;

class Patterns3 {
    public static void main(String[] args) {
        firstPattern();
        System.out.println();
        secondPattern();
        System.out.println();
        thirdPattern();

    }

    public static void firstPattern(){
        // right triangle
        int row = 1;
        int star = 1;
        while(row <= 5){
            // stars
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            // updation
            row++;
            star++;
            System.out.println();
        }
    }
    public static void secondPattern(){
        // upside-down triangle
        int row = 1;
        int star = 5;
        while(row <= 5){
            // stars
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            // updation
            row++;
            star--;
            System.out.println();
        }
    }

    public static void thirdPattern() {
        // right triangle mirror image
        int row = 1;
        int star = 1;
        int space = 5 - star;
        while(row <= 5){
            // space
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }

            // stars
            int j = 1;
            while(j <= star){
                System.out.print("* ");
                j++;
            }

            // updation part
            space--;
            star++;
            row++;
            System.out.println();

        }

    }

}

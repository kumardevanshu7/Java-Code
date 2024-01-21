class Return {
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(4, 5));
        System.out.println(Greeting("Supriya Ji"));
    }

    public static int sumTwoNumbers(int a, int b){
        return a + b;
    }
    public static String Greeting(String Msg){
        return "Good Morning " + Msg;
    }
}

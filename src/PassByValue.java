public class PassByValue {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("init the main with i = " + i);

        test(i);
        System.out.println("end the test method with value in i (and it stays the same) = " + i);
    }

    public static void test(int i ) {
        System.out.println("init the test method with i = " + i);

        i=35;
        System.out.println("end the test method with i = " + i);
    }
}

public class PassByReference {
    public static void main(String[] args) {

        int[] age = {10, 11, 12};

        System.out.println("init the main method ");

        for (int i = 0; i < age.length; i++) {
            System.out.println("age[i] = " + age[i]);
        }
        System.out.println("Before to the test method");
        test(age);
        System.out.println("After to the test method");

        for (int i =0; i < age.length; i++) {
            System.out.println("age[i] = " + age[i]);
        }
        System.out.println("end to the main method with the values modified");
    }

    public static void test(int[] ageArray) {
        System.out.println("init the test method!");

        for (int i =0; i < ageArray.length; i++) {
            ageArray[i] = ageArray[i] + 20;
        }
        System.out.println("end the test method");
    }
}

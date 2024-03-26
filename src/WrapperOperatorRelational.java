public class WrapperOperatorRelational {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Are the same object? " + (num1 == num2));

        num2 = 1000;     // java makes autoboxing until 127 to compare the value, after makes value by reference

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Are the same object? " + (num1 == num2));

        System.out.println("Have the same value " + (num1.equals(num2)));   // compare values in reference types
        System.out.println("Have the same value " + (num1.intValue() == num2.intValue()));      // compare the instance and not its value

        num2 = 500;
        boolean condition = num1 > num2;
        System.out.println("condition = " + condition);

        boolean condition2 = num1.intValue() < num2.intValue();
        System.out.println("condition2 = " + condition2);


    }
}

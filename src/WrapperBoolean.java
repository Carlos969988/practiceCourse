public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; // false
        Boolean objectBoolean = Boolean.valueOf(primBoolean);       // knows to boxing
        Boolean objectBoolean2 = Boolean.valueOf("false");
        Boolean objectBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objectBoolean = " + objectBoolean);
        System.out.println("objectBoolean2 = " + objectBoolean2);

        System.out.println("Comparing two objects boolean " + (objectBoolean == objectBoolean2));
        System.out.println("Comparing two objects boolean " + (objectBoolean.equals(objectBoolean2)));
        System.out.println("Comparing two objects boolean " + (objectBoolean2 == objectBoolean3));
        System.out.println("Comparing two objects boolean " + (objectBoolean == objectBoolean3));

        boolean primBoolean2 = objectBoolean2.booleanValue();       // knows to unboxing
        System.out.println("primBoolean2 = " + primBoolean2);

    }
}

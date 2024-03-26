public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitive = 32768;
        Integer intObject = Integer.valueOf(intPrimitive);
        Integer intObject2 = 32768;
        System.out.println("intObject = " + intObject);

        int num = intObject;
        System.out.println("num = " + num);
        int num2 = intObject.intValue();
        System.out.println("num2 = " + num2);

        String valueTvLcd = "67000";
        Integer value = Integer.valueOf(valueTvLcd);
        System.out.println("value = " + value);

        Short object = intObject.shortValue();
        System.out.println("object = " + object);

        Byte object2 = intObject.byteValue();
        System.out.println("object2 = " + object2);

        Long longObject = intObject.longValue();
        System.out.println("longObject = " + longObject);
    }
}

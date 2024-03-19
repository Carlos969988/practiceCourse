public class PrimitivesFloat {
    public static void main(String[] args) {

        float realFloat = 0.00000000015F; //1.5e-10F;//2.12e3F; //2120F;

        System.out.println("realFloat = " + realFloat);
        System.out.println("float type corresponds in byte to " + Float.BYTES);
        System.out.println("float type corresponds in bytes to " + Float.SIZE);
        System.out.println("maximum value of a float " + Float.MAX_VALUE);
        System.out.println("minimum value of a float " + Float.MIN_VALUE);

        double numberDouble = 3.4028235E38;

        System.out.println("numberDouble = " + numberDouble);
        System.out.println("double type corresponds in byte to " + Double.BYTES);
        System.out.println("double type corresponds in bytes to " + Double.SIZE);
        System.out.println("maximum value of a double " + Double.MAX_VALUE);
        System.out.println("minimum value of a double " + Double.MIN_VALUE);

        float varFloat = 3.1416F;
        System.out.println("varFloat = " + varFloat);

    }
}

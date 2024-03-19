public class PrimitivesInteger {

    public static void main(String[] args) {

        byte numberByte = 127;
        System.out.println("numberByte = " + numberByte);
        System.out.println("byte type corresponds in byte to " + Byte.BYTES);
        System.out.println("byte type corresponds in bytes to " + Byte.SIZE);
        System.out.println("maximum value of a byte " + Byte.MAX_VALUE);
        System.out.println("minimum value of a byte " + Byte.MIN_VALUE);

        short numberShort = 32767;
        System.out.println("numberShort = " + numberShort);
        System.out.println("short type corresponds in byte to " + Short.BYTES);
        System.out.println("short type corresponds in bytes to " + Short.SIZE);
        System.out.println("maximum value of a short " + Short.MAX_VALUE);
        System.out.println("minimum value of a short " + Short.MIN_VALUE);

        int numberInt = 2147483647;
        System.out.println("numberInt = " + numberInt);
        System.out.println("int type corresponds in byte to " + Integer.BYTES);
        System.out.println("int type corresponds in bytes to " + Integer.SIZE);
        System.out.println("maximum value of a int " + Integer.MAX_VALUE);
        System.out.println("minimum value of a int " + Integer.MIN_VALUE);

        long numberLong = 9223372036854775807L;
        System.out.println("numberLong = " + numberLong);
        System.out.println("long type corresponds in byte to " + Long.BYTES);
        System.out.println("long type corresponds in bytes to " + Long.SIZE);
        System.out.println("maximum value of a long " + Long.MAX_VALUE);
        System.out.println("minimum value of a long " + Long.MIN_VALUE);

        var numberVar = 127;    // Consider to type value Integer by Default, when the number is too much big consider Long,Float or Double

    }
}

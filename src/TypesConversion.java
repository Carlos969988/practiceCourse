public class TypesConversion {
    public static void main(String[] args) {

        String numberStr = "50";

        int numberInt = Integer.parseInt(numberStr);
        System.out.println("numberInt = " + numberInt);

        String realString = "98765.43e-3";
        double realDouble = Double.parseDouble(realString);
        System.out.println("realDouble = " + realDouble);

        String logicString = "TRUE";
        boolean logicBoolean = Boolean.parseBoolean(logicString);
        System.out.println("logicBoolean = " + logicBoolean);

        int otherIntNumber = 100;
        System.out.println("otherIntNumber = " + otherIntNumber);

        String otherStrNumber = Integer.toString(otherIntNumber);
        System.out.println("otherStringNumber = " + otherStrNumber);

        otherStrNumber = String.valueOf(otherIntNumber + 10);
        System.out.println("otherStringNumber = " + otherStrNumber);

        double otherRealDouble = 1.23456e2;
        String otherStrReal = Double.toString(otherRealDouble);
        System.out.println("otherStrReal = " + otherStrReal);

        otherStrReal = String.valueOf(1.23456e2F);
        System.out.println("otherStrReal = " + otherStrReal);

        int i = 42768;
        short s = (short)i;     // cast to force the conversion
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);

        char b = (char)i;
        System.out.println("b = " + b);

        float f = (float) i;
        System.out.println("f = " + f);

    }

}

public class PrimitivesCharacters {
    public static void main(String[] args) {

        var character = '\u0040';   // Unicode form
        var decimal = 64;

        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = character: " + (decimal == character));

        char symbol = '@';
        System.out.println("symbol = " + symbol);
        System.out.println("symbol = character: " + (symbol == character));

        char space = '\u0020'; //' ';
        char recoil = '\b'; // erase the last char
        char tabulator = '\t';  // can add any character in the string
        char newLine = '\n';
        char returnCar = '\r';

        System.out.println("char type corresponds in byte to" + System.lineSeparator() + Character.BYTES);
        System.out.println("char type corresponds in \tbytes to " + Character.SIZE);
        System.out.println("maximum value of a char " + Character.MAX_VALUE);
        System.out.println("minimum value of a char " + Character.MIN_VALUE);

    }
}

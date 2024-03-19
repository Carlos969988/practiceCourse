import javax.swing.*;

public class numberSystems {
    public static void main(String[] args) {

        String numberStr = JOptionPane.showInputDialog(null, "Enter an integer");
        int decimalNumber= 0;
        try {
            decimalNumber = Integer.parseInt(numberStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error, you must enter an integer");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String resultBinary = "Binary Number of = " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        System.out.println(resultBinary);
        int binaryNumber = 0b111110100;
        System.out.println("binaryNumber = " + binaryNumber);

        String resultOctal = "octalNumber of = " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        System.out.println(resultOctal);
        int octalNumber = 0764;
        System.out.println("octalNumber = " + octalNumber);

        String resultHex = "hexadecimalNumber of = " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
        System.out.println(resultHex);
        int hexNumber = 0x1f4;
        System.out.println("hexNumber = " + hexNumber);

        String message = resultBinary;
        message += "\n" + resultOctal;
        message += "\n" + resultHex;
        JOptionPane.showMessageDialog(null, message);

    }

}

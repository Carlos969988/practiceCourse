import java.util.Scanner;

public class NumberSystemsEntranceScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        // String numberStr = scanner.nextLine();
        int decimalNumber= 0;
        try {
            decimalNumber = scanner.nextInt(); // Integer.parseInt(numberStr);
        } catch (Exception e) {
            System.out.println("error, you must enter an integer");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String resultBinary = "Binary Number of = " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);

        String resultOctal = "octalNumber of = " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);

        String resultHex = "hexadecimalNumber of = " + decimalNumber + " = " + Integer.toHexString(decimalNumber);

        String message = resultBinary;
        message += "\n" + resultOctal;
        message += "\n" + resultHex;

        System.out.println(message);
    }

}

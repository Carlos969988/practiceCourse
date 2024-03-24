import java.util.Scanner;

public class TernaryOperatorBiggerNumber {
    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = s.nextInt();

        System.out.println("Enter a second number");
        int num2 = s.nextInt();

        System.out.println("Enter a third number");
        int num3 = s.nextInt();

        System.out.println("Enter a fourth number");
        int num4 = s.nextInt();

        max = (num1 > num2) ? num1 : num2;  // if num1 is bigger than num2 return num1, otherwise return num2
        max = (max > num3) ? max : num3;    // if max is bigger than num3 return max, otherwise return num3
        max = (max > num4) ? max : num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("max number is: " + max);
    }
}

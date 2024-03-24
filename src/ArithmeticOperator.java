import javax.swing.*;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int i = 5, j = 4, sum = i + j;

        System.out.println("sum = " + sum);
        System.out.println("i = " + (i + j));

        int rest = i - j;
        System.out.println("rest = " + rest);
        System.out.println("i - j= " + (i - j ));

        int multi = i * j;
        System.out.println("multi = " + multi);

        int div = i / j;
        float div2 = (float) i / (float) j;     // to the float point return correct with all decimals needs to do a cast
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int excess = i % j;
        System.out.println("excess = " + excess);

        excess = 8 % 5;
        System.out.println("excess = " + excess);

        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        if (num % 2 == 0) {
            System.out.println("par number = " + num);
        } else {
            System.out.println("an odd number = " + num);
        }
    }
}

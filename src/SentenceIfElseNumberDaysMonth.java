import java.util.Scanner;

public class SentenceIfElseNumberDaysMonth {
    public static void main(String[] args) {        // know if a year is a leap year

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the number of the month between 1 - 12");
        int month = sca.nextInt();
        int daysNumber = 0;
        System.out.println("Enter the year (YYYY)");
        int year = sca.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            daysNumber = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysNumber = 30;
        } else if (month == 2) {
            if (year % 400 == 0 || ( (year % 4 == 0) && !(year % 100 == 0)) ) {
                daysNumber = 29;
            } else {
                daysNumber = 28;
            }
        }
        System.out.println("daysNumber = " + daysNumber);
    }
}

import java.util.Scanner;

public class SentenceSwitchCaseNumberDaysMonth {
    public static void main(String[] args) {        // know if a year is a leap year

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the number of the month between 1 - 12");
        int month = sca.nextInt();
        int daysNumber = 0;
        System.out.println("Enter the year (YYYY)");
        int year = sca.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysNumber = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysNumber = 30;
                break;
            case 2:
                if (year % 400 == 0 || ( (year % 4 == 0) && !(year % 100 == 0)) ) {
                    daysNumber = 29;
                } else {
                    daysNumber = 28;
                }
                break;
            default:
                daysNumber = 0;
        }

        System.out.println("daysNumber = " + daysNumber);
    }
}

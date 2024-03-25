import java.util.Scanner;

public class SentenceSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of the month between 1 - 12");
        int month = s.nextInt();
        String monthName = null;

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
            case  11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Undefined";
        }

        System.out.println("monthName = " + monthName);

        int num = 8;

        switch (num) {
            case 0:
                System.out.println("Number is zero");
                break;
            case 1:
                System.out.println("Number is one");
                break;
            case 2:
                System.out.println("Number is two");
                break;
            case 3:
                System.out.println("number is three");
                break;
            default:
                System.out.println("Number or character is unknown");
        }

        String name = "ana";

        switch (name) {
            case "admin":
                System.out.println("Hello admin, you're welcome");
                break;
            case "juan":
                System.out.println("Hello juan, you´re welcome");
                break;
            case "carlos":
                System.out.println("Hello carlos, you´re welcome");
                break;
            default:
                System.out.println("Your name is incorrect");
        }
    }
}

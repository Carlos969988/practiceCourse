import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleJavaUtilDayParse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Enter a date with format yyyy-MM-dd");
        try {
            Date date = format.parse(scan.next());
            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));

            Date date2 = new Date();

            System.out.println("date2 = " + date2);

            if (date.after(date2)) {
                System.out.println("User date is after to date2 (actually)");
            } else if (date.before(date2)) {
                System.out.println("User date is before than date2");
            } else if (date.equals(date2)) {
                System.out.println("the date is equals than date2");
            }

            if (date.compareTo(date2) > 0) {
                System.out.println("User date is after to date2 (actually)");
            } else if (date.compareTo(date2) < 0) {
                System.out.println("User date is before than date2");
            } else if (date.compareTo(date2) == 0) {
                System.out.println("the date is equals than date2");
            }
        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println("Date has an incorrect format " + e.getMessage());
            System.err.println("Format must be 'yyyy-MM-dd'");
            //System.exit(1);
            main(args);
        }
    }
}

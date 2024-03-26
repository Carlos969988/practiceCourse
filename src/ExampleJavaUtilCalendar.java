import javax.xml.catalog.CatalogException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        //calendar.set(2030, Calendar.MARCH, 25, 18, 12, 12);
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        //calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 125);

        Date dt = calendar.getTime();
        System.out.println("date without format = " + dt);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String dateFormat = format.format(dt);
        System.out.println("date with format = " + dateFormat);
    }
}

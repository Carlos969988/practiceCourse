import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleJavaUtilDate {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("date = " + date);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'of' MMMM/yyyy");
        String dateStr = df.format(date);

        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date endDate = new Date();
        long finalTime = endDate.getTime() - date.getTime();
        System.out.println("time int he for = " + finalTime);
        System.out.println("dateStr = " + dateStr);

    }
}

package burk.daily.expensemanager.util;
import java.text.SimpleDateFormat;
import java.sql.Date;
public class DateTimeUtil {
    public static String convertDateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(date);
    }

}

package nextDay;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    public static String getNextDay(int day, int month, int year) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();   //khoi tao bien calendar lay lich cua he thong
        calendar.set(year, month-1, day+1);

        Date date = calendar.getTime();
        return dateFormat.format(date);
    }
}
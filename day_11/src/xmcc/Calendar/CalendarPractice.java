package xmcc.Calendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {
    public static void main(String[] args) {
        Calendar calendar= Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.MILLISECOND));
        //在2017年的基础上加一年减一年
        calendar.add(1,2);
        System.out.println(calendar.get(Calendar.YEAR));
        SimpleDateFormat s=new SimpleDateFormat();
        Date d=new Date();
        System.out.println(s.format(d));
        //设置年
        calendar.set(Calendar.YEAR,2017);
        System.out.println(calendar.get(Calendar.YEAR));


        //返回date类型的值
        Date date=calendar.getTime();
        System.out.println(date);

        System.out.println(calendar.getTimeInMillis());
    }


}

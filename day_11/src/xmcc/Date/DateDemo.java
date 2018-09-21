package xmcc.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
getTime()获得毫秒数
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date= new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String myBirthday="1996-02-07";
        Date d=simpleDateFormat.parse(myBirthday);
        System.out.println(d.getTime());
        System.out.println(d);
        System.out.println(date);
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat();
        System.out.println(simpleDateFormat.format(d));
        double day=(double) (date.getTime()-d.getTime())/(24*60*60*1000);
        System.out.println(day);


    }
}

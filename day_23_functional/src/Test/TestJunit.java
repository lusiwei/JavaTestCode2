package Test;
import DateUtil.DateUtil;
import org.junit.Test;

import java.util.Date;

public class TestJunit {
    @Test
    public void parseDate(){
        System.out.println("运行了");
        Date d=new DateUtil().parseDate("2017-19-19");
        System.out.println(d.toString());
    }


}

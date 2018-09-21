package jdbc.pool;

import org.junit.Test;
import util.JDBCUtil;

import java.sql.Connection;

public class JdbcDruidDemo2 {
    @Test
    public void getConn() throws Exception {
        for (int i = 0; i < 5; i++) {
            Connection connection= JDBCUtil.getConnection();
            System.out.println(connection);
        }
    }

}

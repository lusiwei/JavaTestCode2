package jdbc.pool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class JdbcDruidDemo {
    public static void main(String[] args) throws Exception {
        Properties properties=new Properties();
        InputStream resourceAsStream = JdbcDruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(resourceAsStream);
        DataSource dataSource= DruidDataSourceFactory.createDataSource(properties);
        for (int i = 0; i < 11; i++) {
            Connection connection=dataSource.getConnection();
            System.out.println(connection);
            if(i==6){
                connection.close();
            }
        }
    }
}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver"); //加载驱动
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/task2","root","123456");
        String sql="insert into account(aname,money) values('王五',2000)";
        Statement statement=connection.createStatement();
        int i=statement.executeUpdate(sql);
        System.out.println(i);
        statement.close();
        connection.close();
    }
}

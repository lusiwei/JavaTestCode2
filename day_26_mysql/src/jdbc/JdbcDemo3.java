package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/task2", "root", "123456");
        Statement statement = connection.createStatement();
        String sql = "delete from account where aname='张三'";
        int i=statement.executeUpdate(sql);
        System.out.println(i);
        statement.close();
        connection.close();
    }
}

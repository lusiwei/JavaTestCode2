package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/task2","root","123456");
        String sql="update account set money=money-500 where aname='王五'";
        Statement statement=connection.createStatement();
        System.out.println(statement.executeUpdate(sql));

        statement.close();
        connection.close();
    }
}

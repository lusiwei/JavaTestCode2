package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/task2";
        String username="root";
        String passwd="123456";
        Connection connection = DriverManager.getConnection(url, username, passwd);
        String sql = "insert into account(aname,money) values (?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,"郑八");
        ps.setInt(2,1500);
        System.out.println(ps.executeUpdate());
        System.out.println(ps);
        ps.close();
        connection.close();
    }
}

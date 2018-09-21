package task;

import jdbc2.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        login(username, password);
    }

    public static void login(String username, String password) {
        PreparedStatement ps = null;
        Connection connection = null;
        ResultSet resultSet = null;
        //获得连接
        connection = JDBCUtils.getConn();
        String sql = "select * from xuser where username=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            resultSet = ps.executeQuery();

            if (resultSet.next()) {
                System.out.println("用户名正确！！");
                String passwd = resultSet.getString("passwd");
                if (passwd.equals(password)) {
                    System.out.println("恭喜你登录成功！！！");
                    return;
                }
                System.out.println("密码错误！！！");
                return;
            }
            System.out.println("用户名错误！！！！");

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class jdbcQuery1 {
    public static void main(String[] args) {
        List<Student> studentList = query();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static List<Student> query() {
        String url = "jdbc:mysql://localhost:3306/task";
        String username = "root";
        String password = "123456";
        String sql = "select  * from student";
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement ps = null;
        List<Student> studentList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            ps = connection.prepareStatement(sql);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Student stu = new Student();
                stu.setId(resultSet.getInt(1));
                stu.setName(resultSet.getString("name"));
                stu.setEnglish(resultSet.getInt(3));
                stu.setMath(resultSet.getInt(4));
                stu.setChinese(resultSet.getInt(5));
                stu.setSum_score(resultSet.getInt(6));
                studentList.add(stu);
            }
            return studentList;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return null;
    }
}

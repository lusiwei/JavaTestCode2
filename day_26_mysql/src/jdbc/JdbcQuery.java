package jdbc;


import java.sql.*;

public class JdbcQuery {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/task";
        String username="root";
        String password="123456";
        PreparedStatement ps=null;
        Connection connection = null;
        String sql="select * from student";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(url,username,password);
            ps=connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                System.out.print(resultSet.getInt(1)+" ");
                System.out.print(resultSet.getString(2)+" ");
                System.out.print(resultSet.getInt(3)+" ");
                System.out.print(resultSet.getInt(4)+" ");
                System.out.print(resultSet.getInt(5)+" ");
                System.out.print(resultSet.getInt(6)+" ");
                System.out.println();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    System.out.println("关闭失败");
                }
            }
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("关闭失败");
                }
            }
        }
    }
}

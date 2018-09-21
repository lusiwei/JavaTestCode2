package springjdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import util.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class SpringJdbcDemo {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());

    /**
     * 1. 修改张小明的数学成绩为 30
     * 2. 添加一条记录
     * 3. 删除刚才添加的记录
     * 4. 查询id为95006的记录，将其封装为Map集合
     * 5. 查询所有记录，将其封装为List
     * 6. 查询所有记录，将其封装为Student对象的List集合
     * 7. 查询总记录数
     **/
    @Test
    public void udpate() {
        //增删改
        String sql = "update student set Math=99 where name='张小明'";
        jdbcTemplate.update(sql);
    }

    @Test
    public void udpate2() {
        String sql="alter table student modify id int auto_increment";
        jdbcTemplate.update(sql);
    }
    @Test
    public void insert(){
        String sql="insert into student values(null,'黄蓉',88,78,93)";
        jdbcTemplate.update(sql);
    }
    @Test
    public void queryOne(){
        String sql ="select * from student where id=?";
        Map<String,Object> map=jdbcTemplate.queryForMap(sql,6);
        System.out.println(map);
    }
    @Test
    public void queryList(){
        String sql="select * from student";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        maps.forEach(x-> System.out.println(x));
    }
    @Test //把查询结果封装到对象中
    public void query(){
        String sql="select * from student";
        Student student = jdbcTemplate.queryForObject(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setEnglish(resultSet.getInt("English"));
                student.setMath(resultSet.getInt("English"));
                student.setChinese(resultSet.getInt("English"));
                return student;
            }
        });
        System.out.println(student);
    }


}

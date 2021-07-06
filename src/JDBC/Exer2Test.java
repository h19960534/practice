package JDBC;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author blue_raincoat
 * @version 1.0
 * @create 2021-07-06 23:54
 */
public class Exer2Test {

    @Test
    public void testInsert() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("四级/六级: ");
        int type = scanner.nextInt();
        System.out.print("身份证号: ");
        String IDCard = scanner.next();
        System.out.print("准考证号: ");
        String examCard = scanner.next();
        System.out.print("学生姓名: ");
        String studentName = scanner.next();
        System.out.print("所在城市: ");
        String location = scanner.next();
        System.out.print("考试成绩: ");
        int grades = scanner.nextInt();

        String sql = "insert into examstudent(type,IDCard," +
                "examCard,studentName,location,grades) values(?,?,?,?,?,?)";
        update(sql,type,IDCard,examCard,studentName,location,grades);
    }

    public int update(String sql, Object ...args) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://localhost:3306/examstudent"
                    + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

            // 数据库的用户名与密码，需要根据自己的设置
            final String USER = "root";
            final String PASS = "1519348454";

            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            ps = conn.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1, args[i]);
            }

            return ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            ps.close();
            conn.close();
        }
        return 0;
    }
}

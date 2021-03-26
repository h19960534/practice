package v2ch05;



import javax.sql.rowset.*;
import java.sql.SQLException;


public class CachedRowSetTest {
    public static void main(String[] args) throws SQLException, SQLException {
        RowSetFactory factory = RowSetProvider.newFactory();
        CachedRowSet crs = factory.createCachedRowSet();
        crs.setUrl("jdbc:mysql://localhost:3306/world");
        crs.setUsername("root");
        crs.setPassword("1519348454");

        crs.setCommand("SELECT id, name, population FROM city");
        crs.setPageSize(30);
        crs.execute();

        for ( int i = 0; i < 3; i++) {
            while (crs.next()) {
                // 通过字段检索
                int id = crs.getInt("id");
                String name = crs.getString("name");
                int population = crs.getInt("population");

                // 输出数据
                System.out.printf("%-8s", "ID: " + id);
                System.out.printf(", %-28s", "国家名称: " + name);
                System.out.print(", 国家人口: " + population);
                System.out.print("\n");
            }
            crs.nextPage();
            System.out.println("--------------------------------------------------------------");
        }
    }

}

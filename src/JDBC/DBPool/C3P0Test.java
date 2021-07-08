package JDBC.DBPool;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.junit.Test;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author blue_raincoat
 * @version 1.0
 * @create 2021-07-09 0:03
 */
public class C3P0Test {

    @Test
    public void testGetConnection() throws Exception {

//        //获取c3p0数据库连接池
//        ComboPooledDataSource cpds = new ComboPooledDataSource("helloc3p0");
//        Connection conn = cpds.getConnection();
//        System.out.println(conn);

        //获取dbcp数据库连接池
        Properties props = new Properties();
        FileInputStream is = new FileInputStream(new File("src/dbcp.properties"));
        props.load(is);
        DataSource source = BasicDataSourceFactory.createDataSource(props);
        Connection conn = source.getConnection();
        System.out.println(conn);


    }
}

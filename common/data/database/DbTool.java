/**
 * 
 */
package data.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;


/**
 * 数据库连接工具
 * 
 * 使用druid连接池
 * 
 * @author zhangchenhao
 *
 *
 * 2013-5-27
 * 5:03:30
 *
 * TODO:
 */
public class DbTool{

	public static final Connection getConnection(){
		DruidDataSource dataSource = new DruidDataSource();
	    dataSource.setUrl("jdbc:mysql://localhost:3306/jyt");
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUsername("root");
	    dataSource.setPassword("root");
	    dataSource.setTestWhileIdle(true);
	    DruidPooledConnection conn = null;
	    try {
	        conn = dataSource.getConnection();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
	    return conn;
	}
	
	public static final void closeConnection(Connection connection){
		try
		{
			connection.close( );
		}
		catch ( SQLException e )
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
	    String sql = "select * from ke";
	    Connection conn = null;
	    try {
	        conn = getConnection();
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.execute();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
}

package estore_sample.estore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestRun {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String url = "jdbc:oracle:thin:@10.64.70.99:1530:estoreT3";    
//			String user = "es_dev";
//			String password = "es_dev";
//			Connection conn = DriverManager.getConnection(url, user, password);
//			ResultSet resultSet = conn.createStatement().executeQuery("select * from co_master where 1=1 and rownum <3");
//			while (resultSet.next()) {
//			    String sid = resultSet.getString(2);
//			    System.out.println(sid);
//			}
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";    
			String user = "system";
			String password = "admin";
			Connection conn = DriverManager.getConnection(url, user, password);
			ResultSet resultSet = conn.createStatement().executeQuery("select * from adm_menu where 1=1 and rownum <3");
			while (resultSet.next()) {
			    String sid = resultSet.getString(2);
			    System.out.println(sid);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

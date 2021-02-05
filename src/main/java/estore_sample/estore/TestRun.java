package estore_sample.estore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.fet.db.oracle.pojo.EstoreTutorialAiko;

public class TestRun {

	
	/**
	 * 測試連線用
	 * */
	public void testOracleConnection(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@10.64.70.99:1530:estoreT3";    
			String user = "es_dev";
			String password = "es_dev";
			Connection conn = DriverManager.getConnection(url, user, password);
			ResultSet resultSet = conn.createStatement().executeQuery("select * from ESTORE_TUTORIAL_AIKO where 1=1 and rownum <3");
			while (resultSet.next()) {
			    String sid = resultSet.getString(2);
			    System.out.println(sid);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 測試Hibernate
	 * */
	public void testHibernate(){
		Session session = null;
		SessionFactory sessionFactory = null;
		try{
			 Properties settings = new Properties();
			 settings.setProperty("hibernate.connection.driver_class", "oracle.jdbc.OracleDriver");
			 settings.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@10.64.70.99:1530:estoreT3");
			 settings.setProperty("hibernate.connection.username", "es_dev");
			 settings.setProperty("hibernate.connection.password", "es_dev");
			 settings.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle8iDialect");
			 settings.setProperty("show_sql", "true");
			
			 Configuration config = new Configuration();
			 config.setProperties(settings);
			 config.addAnnotatedClass(EstoreTutorialAiko.class);
			 
			 
			 sessionFactory = config.buildSessionFactory();  
			 session = sessionFactory.openSession();
			 
			 //原生sql
			 Query query = session.createNativeQuery("select * from ESTORE_TUTORIAL_AIKO");
			 System.out.println(query.list().size());

			 //HQL
			 query = session.createQuery(" from EstoreTutorialAiko");
			 List<EstoreTutorialAiko> estoreTutorialAikoList = query.list();
			 for (EstoreTutorialAiko estoreTutorialAiko : estoreTutorialAikoList) {
				 System.out.println("ID:"+estoreTutorialAiko.getId());
				 System.out.println("NAME:"+estoreTutorialAiko.getUserName());
			 }
			 
			 
			 //新增
			 Transaction transaction  = session.beginTransaction();
			 EstoreTutorialAiko estoreTutorialAikoAdd = new EstoreTutorialAiko();
			 estoreTutorialAikoAdd.setId(UUID.randomUUID().toString());
			 estoreTutorialAikoAdd.setUserName("TEST");
			 estoreTutorialAikoAdd.setUserRemain(Long.valueOf("5"));
			 estoreTutorialAikoAdd.setUserAddr("TTTT");
			 estoreTutorialAikoAdd.setCreateTime(new Date());
			 estoreTutorialAikoAdd.setUpdateTime(new Date());
			 session.save(estoreTutorialAikoAdd);
			 session.flush();
			 transaction.commit();
			 
			 transaction  = session.beginTransaction();
			 query = session.createQuery(" from EstoreTutorialAiko where userName =:findName ");    
			 query.setParameter("findName", "Alice");
			 List<EstoreTutorialAiko> findEstoreTutorialAikoList = query.list();
			 if(findEstoreTutorialAikoList.size() == 1){
				 EstoreTutorialAiko estoreTutorialAiko = findEstoreTutorialAikoList.get(0);
				 System.out.println(estoreTutorialAiko.getUserAddr());
			 }
			 
			 
			 session.close();
			 sessionFactory.close();
		}catch(Exception e){
			session.close();
			sessionFactory.close();
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		TestRun testRun = new TestRun();
		testRun.testOracleConnection();
		testRun.testHibernate();
	}

}

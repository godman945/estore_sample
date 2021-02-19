package estore_sample.estore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.fet.db.oracle.pojo.EstoreTutorialAiko;
import com.fet.db.oracle.pojo.EstoreTutorialAlex;
//import com.fet.estore.core.model.SmsMessage;
import com.fet.db.oracle.service.estoreTutorialAiko.IEstoreTutorialAlexService;
import com.fet.spring.init.SpringbootWebApplication;

@Component
public class TestRun {

	@Autowired
	private IEstoreTutorialAlexService estoreTutorialAlexService;
	
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
			 config.addAnnotatedClass(EstoreTutorialAlex.class);
			 
			 
			 sessionFactory = config.buildSessionFactory();  
			 session = sessionFactory.openSession();
			 
			 //原生sql
			 Query query = session.createNativeQuery("select * from ESTORE_TUTORIAL_ALEX");
			 System.out.println(query.list().size());

			//HQL
			 query = session.createQuery(" from EstoreTutorialAlex");
			 List<EstoreTutorialAlex> estoreTutorialAlexList = query.list();
			 for (EstoreTutorialAlex estoreTutorialAlex : estoreTutorialAlexList) {
				 System.out.println("ID:"+estoreTutorialAlex.getId());
				 System.out.println("NAME:"+estoreTutorialAlex.getUserName());
			 }
			 
			 
			 
			 
			 
			 
//			 //HQL
//			 query = session.createQuery(" from EstoreTutorialAiko");
//			 List<EstoreTutorialAiko> estoreTutorialAikoList = query.list();
//			 for (EstoreTutorialAiko estoreTutorialAiko : estoreTutorialAikoList) {
//				 System.out.println("ID:"+estoreTutorialAiko.getId());
//				 System.out.println("NAME:"+estoreTutorialAiko.getUserName());
//			 }
			 
			 
			 
//			 List a = new ArrayList();
//			 a.get(1);
			 
			 
			 
			 
			 //新增
//			 Transaction transaction  = session.beginTransaction();
//			 EstoreTutorialAiko estoreTutorialAikoAdd = new EstoreTutorialAiko();
//			 estoreTutorialAikoAdd.setId(UUID.randomUUID().toString());
//			 estoreTutorialAikoAdd.setUserName("TEST");
//			 estoreTutorialAikoAdd.setUserRemain(Long.valueOf("5"));
//			 estoreTutorialAikoAdd.setUserAddr("TTTT");
//			 estoreTutorialAikoAdd.setCreateTime(new Date());
//			 estoreTutorialAikoAdd.setUpdateTime(new Date());
//			 session.save(estoreTutorialAikoAdd);
//			 session.flush();
//			 transaction.commit();
//			 
//			 transaction  = session.beginTransaction();
//			 query = session.createQuery(" from EstoreTutorialAiko where userName =:findName ");    
//			 query.setParameter("findName", "Alice");
//			 List<EstoreTutorialAiko> findEstoreTutorialAikoList = query.list();
//			 if(findEstoreTutorialAikoList.size() == 1){
//				 EstoreTutorialAiko estoreTutorialAiko = findEstoreTutorialAikoList.get(0);
//				 System.out.println(estoreTutorialAiko.getUserAddr());
//			 }
			 
			 
			 session.close();
			 sessionFactory.close();
		}catch(Exception e){
			session.close();
			sessionFactory.close();
			e.printStackTrace();
		}
	}
	
	@Transactional
	public void springHibernate(){
		
		EstoreTutorialAlex estoreTutorialAlex = estoreTutorialAlexService.get("66bdcb69-d1d0-4793-abe0-ce9b3da0702a");
		System.out.println(estoreTutorialAlex.getUserAddr());
		
		
		//		estoreTutorialAiko.setUserName("ALEX3");
//		estoreTutorialAikoService.saveOrUpdate(estoreTutorialAiko);
//		
//		List a = new ArrayList();
//		System.out.println(a.get(1));
		
//		System.out.println(estoreTutorialAiko == null);
//		System.out.println(estoreTutorialAiko.getUserAddr());
	
	
	}
	
//	public void senSMS(){
//		
////		createSmsMessage(msisdn, sender, message, whenToSend);
//		
//		
//		SmsMessage smsMessage = new SmsMessage();
//		smsMessage.setSender(null);
//		smsMessage.setMessage("TEST");
//		smsMessage.setReceivreMsisdn("0915908672");
//		smsMessage.setSubmitTime(new Date());
//		nSmsMessageDAO.save(smsMessage);
//	}
	
	public static void main(String[] args) {
//		ApplicationContext ctx = new SpringApplicationBuilder(SpringbootWebApplication.class).web(WebApplicationType.NONE).run(args);
//		TestRun testRun = ctx.getBean(TestRun.class);
//		testRun.testHibernate();
		
//		TestRun2 testRun2 = ctx.getBean(TestRun2.class);
//		testRun.springHibernate(testRun2.getTEST());
		
		
		TestRun testRun = new TestRun();
		testRun.testOracleConnection();
////		testRun.testHibernate();
//		testRun.springHibernate();
//		testRun.senSMS();
	}

}

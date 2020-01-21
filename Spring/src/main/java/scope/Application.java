package scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	private static Logger log=LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) 
	{
		ApplicationContext appcontext=SpringApplication.run(Application.class, args);
		PersonDAO personDAO=appcontext.getBean(PersonDAO.class);
		PersonDAO personDAO2=appcontext.getBean(PersonDAO.class);
		
		log.info("{}",personDAO);
		log.info("{}",personDAO.getJdbcConnetion());
		log.info("{}",personDAO2);
		log.info("{}",personDAO2.getJdbcConnetion());
		
	}

}

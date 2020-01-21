package scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

	@Autowired
	JdbcConnection jdbcConnetion;

	public JdbcConnection getJdbcConnetion() {
		return jdbcConnetion;
	}

	public void setJdbcConnetion(JdbcConnection jdbcConnetion) {
		this.jdbcConnetion = jdbcConnetion;
	}
	
	
}

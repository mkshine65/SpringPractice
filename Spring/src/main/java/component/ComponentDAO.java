package component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

	@Autowired
	ComponentJdbcConnection jdbcConnetion;

	public ComponentJdbcConnection getJdbcConnetion() {
		return jdbcConnetion;
	}

	public void setJdbcConnetion(ComponentJdbcConnection jdbcConnetion) {
		this.jdbcConnetion = jdbcConnetion;
	}
	
	
}

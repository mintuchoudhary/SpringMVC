package  com.spring.mvc.requestsession;

import java.util.Date;

public class HelloSessionScopeDataImpl implements HelloSessionScopeData {
	private final Date date;

	public HelloSessionScopeDataImpl(Date date) {
		this.date = date;
	}

 
	public String getDate() {
		return date.toString();
	}
}

  package  com.spring.mvc.requestsession;

import java.util.Date;

public class HelloRequestScopeDataImpl implements HelloRequestScopeData {

	private final Date date;

	public HelloRequestScopeDataImpl(Date date) {
		this.date = date;
	}

	public String getDate() {
		return date.toString();
	}
}

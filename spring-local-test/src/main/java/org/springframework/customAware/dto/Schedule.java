package org.springframework.customAware.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.customAware.DateAware;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Schedule implements DateAware {
	private Date injectAwareDate;
	@Value("TEST-Schedule")
	private String scheduleName;

	@Override
	public void setDate(Date date) {
		injectAwareDate = date;
	}

	public Date getInjectAwareDate() {

		return injectAwareDate;
	}

	public void setInjectAwareDate(Date injectAwareDate) {
		this.injectAwareDate = injectAwareDate;
	}

	public String getScheduleName() {
		return scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
}

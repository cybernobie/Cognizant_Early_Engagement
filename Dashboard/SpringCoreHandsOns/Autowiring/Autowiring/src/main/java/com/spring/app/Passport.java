package com.spring.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class Passport {
	private int passNum;
	private Date dateOfIssue;
	private Date dateOfExpiry;

	public int getPassNum() {
		return passNum;
	}

	public void setPassNum(int passNum) {
		this.passNum = passNum;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public String toString() {
		// Defining the format in which the dates should be printed
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		return "Passport [passNum=" + passNum + ", dateOfIssue=" + sdf.format(dateOfIssue) + ", dateOfExpiry="
				+ sdf.format(dateOfExpiry) + "]";
	}

}

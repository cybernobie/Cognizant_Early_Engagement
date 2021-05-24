package com.cts.cit.model;

import org.springframework.stereotype.Component;

@Component
//CustomerCareRepresentative
public class CCRepresentative {

	String ccRId;
	String ccrName;
	String ccrAddress;
	String ccrPhone;
	String ccrEMail;
	int issuesInProgress;
	String issueIds;
	
	public CCRepresentative() {
		super();
	}

	public CCRepresentative(String ccRId, String ccrName, String ccrAddress, String ccrPhone, String ccrEMail,
			int issuesInProgress, String issueIds) {
		super();
		this.ccRId = ccRId;
		this.ccrName = ccrName;
		this.ccrAddress = ccrAddress;
		this.ccrPhone = ccrPhone;
		this.ccrEMail = ccrEMail;
		this.issuesInProgress = issuesInProgress;
		this.issueIds = issueIds;
	}

	public String getCcRId() {
		return ccRId;
	}

	public void setCcRId(String ccRId) {
		this.ccRId = ccRId;
	}

	public String getCcrName() {
		return ccrName;
	}

	public void setCcrName(String ccrName) {
		this.ccrName = ccrName;
	}

	public String getCcrAddress() {
		return ccrAddress;
	}

	public void setCcrAddress(String ccrAddress) {
		this.ccrAddress = ccrAddress;
	}

	public String getCcrPhone() {
		return ccrPhone;
	}

	public void setCcrPhone(String ccrPhone) {
		this.ccrPhone = ccrPhone;
	}

	public String getCcrEMail() {
		return ccrEMail;
	}

	public void setCcrEMail(String ccrEMail) {
		this.ccrEMail = ccrEMail;
	}

	public int getIssuesInProgress() {
		return issuesInProgress;
	}

	public void setIssuesInProgress(int issuesInProgress) {
		this.issuesInProgress = issuesInProgress;
	}

	public String getIssueIds() {
		return issueIds;
	}

	public void setIssueIds(String issueIds) {
		this.issueIds = issueIds;
	}

	@Override
	public String toString() {
		return "CCRepresentative [ccRId=" + ccRId + ", ccrName=" + ccrName + ", ccrAddress=" + ccrAddress
				+ ", ccrPhone=" + ccrPhone + ", ccrEMail=" + ccrEMail + ", issuesInProgress=" + issuesInProgress
				+ ", issueIds=" + issueIds + "]";
	}

	
	
	
	
}

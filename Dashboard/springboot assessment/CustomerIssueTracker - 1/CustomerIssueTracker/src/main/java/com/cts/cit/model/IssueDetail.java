package com.cts.cit.model;

import java.util.Date;

public class IssueDetail {

	String custIssueId;
	Date issueReportDate;
	String custId;
	String category; //Complaint - Feedback - Suggestion
	String description;
	String issueStatus;//InProgress;Closed;Open
	String ccRepId; // Customer Care Representative Id
	
	
	
	public IssueDetail() {
		super();
	}



	public IssueDetail(String custIssueId, Date issueReportDate, String custId, String category, String description,
			String issueStatus, String ccRepId) {
		super();
		this.custIssueId = custIssueId;
		this.issueReportDate = issueReportDate;
		this.custId = custId;
		this.category = category;
		this.description = description;
		this.issueStatus = issueStatus;
		this.ccRepId = ccRepId;
	}



	public String getCustIssueId() {
		return custIssueId;
	}



	public void setCustIssueId(String custIssueId) {
		this.custIssueId = custIssueId;
	}



	public Date getIssueReportDate() {
		return issueReportDate;
	}



	public void setIssueReportDate(Date issueReportDate) {
		this.issueReportDate = issueReportDate;
	}



	public String getCustId() {
		return custId;
	}



	public void setCustId(String custId) {
		this.custId = custId;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getIssueStatus() {
		return issueStatus;
	}



	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}



	public String getCcRepId() {
		return ccRepId;
	}



	public void setCcRepId(String ccRepId) {
		this.ccRepId = ccRepId;
	}



	@Override
	public String toString() {
		return "IssueDetail [custIssueId=" + custIssueId + ", issueReportDate=" + issueReportDate + ", custId=" + custId
				+ ", category=" + category + ", description=" + description + ", issueStatus=" + issueStatus
				+ ", ccRepId=" + ccRepId + "]";
	}
	
	
	
	
}

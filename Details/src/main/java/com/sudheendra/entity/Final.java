package com.sudheendra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="final")
public class Final {
	@Id
	@Column(name="firstname")
	private String firstname;
	@Column(name="currentemployer")
	private String currentemployer;
	@Column(name="currentctc")
	private String currentctc;
	@Column(name="expectedctc")
	private String expectedctc;
	@Column(name="noticeperiod")
	private String noticeperiod;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getCurrentemployer() {
		return currentemployer;
	}
	public void setCurrentemployer(String currentemployer) {
		this.currentemployer = currentemployer;
	}
	public String getCurrentctc() {
		return currentctc;
	}
	public void setCurrentctc(String currentctc) {
		this.currentctc = currentctc;
	}
	public String getExpectedctc() {
		return expectedctc;
	}
	public void setExpectedctc(String expectedctc) {
		this.expectedctc = expectedctc;
	}
	public String getNoticeperiod() {
		return noticeperiod;
	}
	public void setNoticeperiod(String noticeperiod) {
		this.noticeperiod = noticeperiod;
	}
}

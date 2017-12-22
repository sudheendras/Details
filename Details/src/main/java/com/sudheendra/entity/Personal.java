package com.sudheendra.entity;

import java.awt.print.Book;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="personal")
public class Personal {
	@Id
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="phonenumber")
	private String phonenumber;
	@Column(name="ffullname")
	private String ffullname;
	@Column(name="mfullname")
	private String mfullname;
	@Column(name="emailid")
	private String emailid;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="firstname")
	private Final fin;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getFfullname() {
		return ffullname;
	}
	public void setFfullname(String ffullname) {
		this.ffullname = ffullname;
	}
	public String getMfullname() {
		return mfullname;
	}
	public void setMfullname(String mfullname) {
		this.mfullname = mfullname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Final getFinal() {
		return fin;
	}
	public void setFinal(Final fin) {
		this.fin = fin;
	}
}

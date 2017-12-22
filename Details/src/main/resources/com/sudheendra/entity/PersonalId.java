package com.sudheendra.entity;

import java.util.Date;
@Embeddable
public class PersonalId {
	@Column(name="firstname")
	private String firstName;
	@Column(name="dob")
	private Date dob;
	
	public String getFirstName(){ return firstname;}
	public String getDob(){ return dob; }
	public void setFirstName(String firstName){ this.firstName=firstName;}
	public void setDob(Date dob){ this.dob=dob;}
}

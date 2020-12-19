package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NamedNativeQuery;
import org.hibernate.annotations.NamedQuery;

@NamedQuery(name="getUserDetails.byId", query ="from UserDetails1 where userId =?")
@NamedNativeQuery(name="getUserDetails.byName", query ="select * from userdetails1",resultClass=UserDetails1.class)

@Entity
public class UserDetails1 {
	@Id
	private int userId;
	private String userName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}

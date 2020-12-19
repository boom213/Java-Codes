package com.sonata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
@SecondaryTable(name="Customer_Details")

public class Customer {
	@Id
	@GeneratedValue
	
	private int custId;
	private String custName;
	
	@Column(table="Customer_Details")
	private String custAddress;
	@Column(table="Customer_Details")
	private int creditScore;
	@Column(table="Customer_Details")
	private int rewardPoint;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public int getRewardPoint() {
		return rewardPoint;
	}
	public void setRewardPoint(int rewardPoint) {
		this.rewardPoint = rewardPoint;
	}
}


package mz.co.webapi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "account")
public class Account implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	@GeneratedValue
	private Long accountnumber;
	@Column
	private double balance;
	@Column
	private Date creationdate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
    
    public Account () {     
    	
    }
    
    public double CurrentBalance() {
    	return balance;
    }
    
    public double debitAccount(double amount) {
    	return balance = balance + amount;
    }
    
    public double creditAccount(double amount) {
    	return balance = balance - amount;
    }
}

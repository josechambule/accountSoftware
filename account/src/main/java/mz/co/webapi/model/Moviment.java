package mz.co.webapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "moviment")
public class Moviment implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private char movimentType;
	@Column
	private double value;
	@Column
	private Date movimentDate;
	@Column
	private String details;
	@Column(name = "accountid")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)	
	private List<Account> account = new ArrayList<Account>();
	
	public List<Account> getCourses() {
		return account;
	}

	public void setCourses(List<Account> courses) {
		this.account = courses;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public char getMovimentType() {
		return movimentType;
	}
	
	public void setMovimentType(char movimentType) {
		this.movimentType = movimentType;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public Date getMovimentDate() {
		return movimentDate;
	}
	
	public void setMovimentDate(Date movimentDate) {
		this.movimentDate = movimentDate;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}	
}

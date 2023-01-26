package com.jspiders.serialization.Create;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	private String adredd;
	private String phine;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdredd() {
		return adredd;
	}
	public void setAdredd(String adredd) {
		this.adredd = adredd;
	}
	public String getPhine() {
		return phine;
	}
	public void setPhine(String phine) {
		this.phine = phine;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", adredd=" + adredd + ", phine=" + phine
				+ "]";
	}
	


}

package com.jspiders.hibernate3.inputall;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class HistoryStudent {

	@Id
	private int id;
	private String name;
	private long contact;
}

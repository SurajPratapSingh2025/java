package com.shallowCopy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee implements Cloneable{
	private int eid;
	private int eage;
	private Account account;
	
	public Employee(int eid, int eage, Account account) {
		super();
		System.out.println("My Cons Emp");
		this.eid = eid;
		this.eage = eage;
		this.account = account;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

package com.deepCopy;

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
		System.out.println("My Const.....");
		this.eid = eid;
		this.eage = eage;
		this.account = account;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Account newAcc= (Account) account.clone();
		Employee newEmp = (Employee) super.clone();
		newEmp.account=newAcc;
		return newEmp;
	}
	
	
}
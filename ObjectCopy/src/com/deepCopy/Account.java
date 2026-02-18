package com.deepCopy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account implements Cloneable{
	private int an;
	private int ifsc;
	
	public Account(int an, int ifsc) {
		System.out.println("My Const.....");
		this.an=an;
		this.ifsc=ifsc;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
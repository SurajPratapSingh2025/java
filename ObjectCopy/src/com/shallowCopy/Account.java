package com.shallowCopy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {
	private int an;
	private int ifsc;
	
	public Account(int an, int ifsc) {
		System.out.println("My Cons Acc");
		this.an=an;
		this.ifsc=ifsc;
	}
	
}

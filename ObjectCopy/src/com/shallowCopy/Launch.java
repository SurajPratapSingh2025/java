package com.shallowCopy;

public class Launch {
	public static void main(String[] args) throws CloneNotSupportedException {
		Account account = new Account(1122,166661);
		Employee emp1 = new Employee(11,18,account);
		
		//shallow copy
		Employee emp2 = (Employee) emp1.clone();
		
		System.out.println(emp1.getEid()+" "+emp1.getEage());
		System.out.println(emp1.getAccount().getAn()+" "+emp1.getAccount().getIfsc());
		
		System.out.println(emp2.getEid()+" "+emp2.getEage());
		System.out.println(emp2.getAccount().getAn()+" "+emp2.getAccount().getIfsc());
		
		emp2.getAccount().setAn(190);
		System.out.println("************************************");
		
		System.out.println(emp1.getEid()+" "+emp1.getEage());
		System.out.println(emp1.getAccount().getAn()+" "+emp1.getAccount().getIfsc());
		
		System.out.println(emp2.getEid()+" "+emp2.getEage());
		System.out.println(emp2.getAccount().getAn()+" "+emp2.getAccount().getIfsc());
		
	}
}

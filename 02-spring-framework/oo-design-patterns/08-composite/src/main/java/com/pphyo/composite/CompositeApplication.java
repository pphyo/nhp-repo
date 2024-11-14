package com.pphyo.composite;

public class CompositeApplication {

	public static void main(String[] args) {
		
		var sale = new SaleDepartment(3, "Sales");
		var hr = new HRDepartment(4, "HR");
		var marketing = new MarketingDepartment(10, "Marketing");
		var financial = new FinancialDepartment(5, "Financial");
		var it = new ITDepartment(30, "IT");
		var networking = new NetworkingDepartment(31, "Networking");
		var developing = new DevelopingDepartment(32, "Developing");
		
		it.add(networking);
		it.add(developing);
		
		var head = new HeadDepartment(1, "Head");
		head.add(sale);
		head.add(hr);
		head.add(marketing);
		head.add(financial);
		head.add(it);
		head.printDepartmentName();

		
		System.out.println("After remove financial");
		head.remove(financial);
		head.printDepartmentName();
		
		
	}

}

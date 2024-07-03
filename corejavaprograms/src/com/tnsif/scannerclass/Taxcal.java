package com.tnsif.scannerclass;

public class Taxcal {
	//Person p=new Person();
	public void calculatetax(Person p)
	{
		if(p.getIncome()<=1600)
		{
			p.setTax(0);
		}
		else if(p.getIncome()>1600&&p.getIncome()<40000) {
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}

}

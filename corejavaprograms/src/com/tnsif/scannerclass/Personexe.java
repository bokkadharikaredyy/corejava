package com.tnsif.scannerclass;

import java.util.Scanner;

public class Personexe {
public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter person name");
		String name=sc.nextLine();
		System.out.println("enter person income");
		int income=sc.nextInt();
	Person p =new Person();
	p.setName(name);
	p.setIncome(income);
	
	Taxcal t =new Taxcal();
	t.calculatetax();
	System.out.println("afteer modification");
	System.out.println(p);
	}

}

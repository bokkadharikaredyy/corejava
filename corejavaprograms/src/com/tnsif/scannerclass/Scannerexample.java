package com.tnsif.scannerclass;

import java.util.Scanner;

public class Scannerexample
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name:");
	String name=sc.nextLine();
	System.out.println("enter your rollno:");
	String rollno= sc.nextLine();
	System.out.println("name:"+name);
	System.out.println("enter your rollno:"+rollno);
	
}
}
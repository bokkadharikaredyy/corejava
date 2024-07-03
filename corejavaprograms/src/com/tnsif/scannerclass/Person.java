package com.tnsif.scannerclass;

public class Person {
private String name;
private int income,tax;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getIncome() {
	return income;
}
public void setIncome(int income) {
	this.income = income;
}
public int getTax() {
	return tax;
}
public void setTax(int tax) {
	this.tax = tax;
}
@Override
public String toString() {
	return "Person [name=" + name + ", income=" + income + ", tax=" + tax + "]";
}

}




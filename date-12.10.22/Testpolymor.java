package com.practical;

 class Bank {
float rateOfInterest() {
	return 0;
}
}

class AXIS extends Bank{
	float rateOfInterest() {
		return 6.5f;
	}
}

class SBI extends Bank{
	float rateOfInterest() {
		return 5.5f;
	}
}

class ICICI extends Bank{
	float rateOfInterest() {
		return 7.5f;
	}
}

public class Testpolymor {
	public static void main(String [] args) {
		Bank obj; // upcasting
		obj = new AXIS();
		System.out.println("RATE OF AXIS BANK IS : "+ obj.rateOfInterest());
		
		obj = new SBI();
		System.out.println("RATE OF SBI BANK IS : "+ obj.rateOfInterest());
		
		obj = new ICICI();
		System.out.println("RATE OF ICICI BANK IS : "+ obj.rateOfInterest());
	}
}
package com.practical;

import java.util.Scanner;

class Encap_d{// fully encasulated class
	// private data menthods
	private String Student_name;
	private int StudentUser_id;
	private int password;
	int total,percentage;
	
	public String get_name(){// using getter get name
		return Student_name;
	}
	public void set_name(String stu) {// using setter method set name
		Student_name = stu;
	}
	
	public int get_stu_id(){// using getter get id
		return StudentUser_id;
	}
	public void set_stu_id(int stu) {// using setter method set id 
		 StudentUser_id = stu;
	}
	
	public int get_pass(){// using getter get password
		return password;
	}
	public void set_pass(int stu) {// using setter method set password
		password= stu;
	}
	
	// calc is a method to calculate total marks
	public void calc(int sub1, int sub2,int sub3,int sub4, int sub5) {
		total = sub1+sub2+sub3+sub4+sub5;
		percentage= total/5; //finding percentage
		if(percentage>=35 && percentage<=45) {
			System.out.println("D Grade");
		}
		else if(percentage>=46 && percentage<=55) {
			System.out.println("C Grade");
		}
		else if(percentage>=60 && percentage<=75) {
			System.out.println("B Grade");
		}
		else if(percentage>=76 && percentage<=85) {
			System.out.println("A Grade");
		}
		else if(percentage>=86 && percentage<=100) {
			System.out.println("O Grade");
		}
		else {
			System.out.println("Fail/Absent");
		}
	}
}


public class EncapsulationDemo1 {
public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
	String stuname;
	int stupass, sid;
	int sub1,sub2,sub3,sub4,sub5;
	// user input scanner
	System.out.println("Enter your name: ");
	stuname = s.nextLine();
	System.out.println("Enter your user ID: ");
	sid = s.nextInt();
	System.out.println("Enter your password: ");
	stupass = s.nextInt();
	
	System.out.println("Enter marks of 5 subjects : ");
	System.out.println("Enter marks of sub1 : ");
	sub1 = s.nextInt();
	System.out.println("Enter marks of sub2 : ");
	sub2 = s.nextInt();
	System.out.println("Enter marks of sub3 : ");
	sub3 = s.nextInt();
	System.out.println("Enter marks of sub4 : ");
	sub4 = s.nextInt();
	System.out.println("Enter marks of sub5 : ");
	sub5 = s.nextInt();
	
	Encap_d obj = new Encap_d();
	
	obj.set_name(stuname);
	obj.set_stu_id(sid);
	obj.set_pass(stupass);
	
	System.out.println("Name : "+obj.get_name());
	System.out.println("Name : "+obj.get_stu_id());
	System.out.println("Name : "+obj.get_pass());
	obj.calc(sub1, sub2, sub3, sub4, sub5);
	System.out.println("Percentage : "+obj.percentage);
}
}

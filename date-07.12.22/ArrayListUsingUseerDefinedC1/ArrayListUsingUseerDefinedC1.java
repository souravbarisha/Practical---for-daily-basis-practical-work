package collections;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListUsingUseerDefinedC1 {
public static void main(String[] args) {
	Bank b = new Bank (12345, "Sourav",5000.67,20);
	Bank b1 = new Bank (12345, "Ram",7000.67,21);
	Bank b2 = new Bank (12345, "Sam",5400.67,30);
	Bank b3 = new Bank (12345, "Karan",4000.67,22);
	Bank b4 = new Bank (12345, "Priya",8000.67,55);
	Bank b5 = new Bank (12345, "puja",9000.67,38);
	
	ArrayList<Bank> a1 = new ArrayList<Bank>();
	a1.add(b);
	a1.add(b1);
	a1.add(b2);
	a1.add(b3);
	a1.add(b4);
	a1.add(b5);
	
	Iterator itr =  a1.iterator();
	
	while(itr.hasNext()) {
		Bank obj = (Bank) itr.next();
		System.out.println(obj.accountNo+" "+obj.customerNmae+" "+obj.balance+" "+obj.customerAge);
	}
}
}

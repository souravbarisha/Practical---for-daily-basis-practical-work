package com.practical;
//you will make a class ‘Rectangle’ and declare the variable
//length and breadth as private. One Constructor will be used for 
//initializing the value of variables. 
//
//When an object is created, the constructor will be called and 
//the default value of the instance variables will be assigned. 
//Now create another new class ‘RectangleTest’ & create an 
//object of class Rectangle and assign values of the parameter used 
//in constructor. Calculate area of the rectangle and print 
//it on the console. Let’s update the new value of variable. 
//And then read the updated value. 
//
//Sample Output:   
//
//Area = 800
//
//New area = 900
public class Rectangle {
private static int length;
private static int breadth;
// parameterized constructor
 Rectangle(){
	length = 8;
	breadth = 5;
       }
 Rectangle(int length, int breadth){
	 this.length = length;
	 this.breadth= breadth;
 }

 // method of area 
 int Area() {
	return length*breadth; 
	
}



public class RectangleTest {
	// method of new area
	
	public static void main(String [] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(15,10);
		int A1 = r1.Area();
		int A2= r2.Area();
		System.out.println("calculated area is : "+ A1);
		System.out.println("New area is : "+ A2);
			
			
			
//	System.out.println("new area is : "+r2.Area());
//			int l= r1.getLength();
//			int b= r1.getBreadth();
//			l=15;b=10;
//			int newA =l*b;
//			int newA =getLength()*getBreadth();
//			System.out.println("new area is : "+newA);
			
//        	NewArea(20,15);
			
	}
}

}

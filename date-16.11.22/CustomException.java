package exceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}
public class CustomException {
	public void checkedAge(int age) throws InvalidAgeException{
		if(age<=18 || age>=25) {
			throw new InvalidAgeException("Invalid age for enrolling in java course");
		}
		else {
			System.out.println("proper age for enrolling in java course");
		}
	}
public static void main(String[] args) throws InvalidAgeException {
	CustomException c = new CustomException();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your age");
	int age = s.nextInt();
	c.checkedAge(age);
}
}

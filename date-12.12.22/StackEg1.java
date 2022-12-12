package collections;

import java.util.Stack;

public class StackEg1 {
public static void main(String[] args) {
	Stack<Integer> s = new Stack<Integer>();// declare the stack
	// checking stack is empty or not
	boolean result = s.empty(); // or we can use isEmpty
	System.out.println("is the stack is empty ? : "+ result);
	// adding elements (push)
	s.push(25); // 5
	s.push(35); // 4
	s.push(40); // 3        these are index 
	s.push(55); // 2
	s.push(80); // 1
	s.push(75); // 0
	
	System.out.println("Stack elements: "+s); 
	Integer digit = s.peek(); // access element from the the top of the stack
	System.out.println("top element: "+ digit);
	System.out.println("Stack element after peek: "+s);
	
	Integer digit2 = s.pop(); // access element from the the top of the stack
	System.out.println("top element: "+ digit2);
	System.out.println("Stack element after pop: "+s);
	
	int digit3 = s.search(35); // search any element by it's value
	System.out.println("Search elements: "+digit3);
	
	int x = s.size(); // find the size of the stack
	System.out.println("Stack size: "+ x);
	
	result = s.isEmpty(); // checking empty or not
	System.out.println("is the stack empty ? : "+ result);
	
}
}

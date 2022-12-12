package collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEg2 {
public static void main(String[] args) {
	Stack<Integer> s = new Stack<Integer>();// declare the stack

	// adding elements (push)
	pushelement(s,15); // 5
	pushelement(s,45); // 4
	pushelement(s,20); // 3      these are index 
	pushelement(s,30); // 2
	pushelement(s,40); // 1
	pushelement(s,50); // 0
	// popping elements
	popelement(s);
	popelement(s);
	// checking empty stack if yes throw exception
	try {
		popelement(s);
	}
	catch(EmptyStackException e) {
		System.out.println(e);
	}
}
// push operation 
private static void pushelement (Stack<Integer> s, int i) {
	// invoke puch() method
	s.push(new Integer(i));
	System.out.println("push: "+i);
	System.out.println("stack: "+s); // modified stack
}
// pop operation
private static void popelement (Stack<Integer> s) {
	// invoke pop() method
	Integer i = (Integer)s.pop();
	System.out.println("pop: "+i);
	System.out.println("stack: "+s);// modified stack
}

}

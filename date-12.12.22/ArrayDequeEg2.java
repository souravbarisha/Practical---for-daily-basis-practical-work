package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEg2 {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Pallabi");
		deque.add("Subhrajit");
		deque.add("Mamta");
		deque.add("Priya");
		deque.add("Monami");
		
		System.out.println(deque);
		deque.offerFirst("Anju");
		System.out.println("After offer first: "+deque);
		deque.offerLast("Monalisa");
		System.out.println("After offer last: "+deque);
		// traversing
		for(String str : deque) {
			System.out.println(str);
			//deque.peek() & deque.peekFirst same as peek()
		}
		System.out.println("Peek: "+ deque.peekLast());
		System.err.println("After peek last: ");
		for(String str1 : deque) {
			System.out.println(str1);
		}
		// deque.poll() & deque.pollFirst same as poll()
		System.out.println("poll: "+ deque.pollLast());
		System.err.println("After poll Last: ");
		for(String str : deque) {
			System.out.println(str);
		}
}
	}

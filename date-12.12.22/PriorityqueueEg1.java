package collections;

import java.util.Iterator;
import java.util.PriorityQueue;



public class PriorityqueueEg1 {
public static void main(String[] args) {
	PriorityQueue<String> queue = new PriorityQueue<String>();
queue.add("Prakash");
queue.add("Babai");
queue.add("Sankhajit");
queue.add("Hasan");
queue.add("Bumba");
queue.add("Owashim");
queue.add("Tanmoy");

System.out.println("head: "+queue.element());
System.out.println("Queue: "+ queue);
System.out.println("head: "+queue.peek());
System.out.println("Queue: "+ queue);
System.out.println("Iterating the elelments");
Iterator itr = queue.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

System.out.println("head: "+queue.poll());
System.out.println("Queue: "+ queue);
System.out.println("head: "+queue.remove());
System.out.println("Queue: "+ queue);

System.out.println("after removing: ");
 Iterator<String> itr1 = queue.iterator();
 while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}


}
}

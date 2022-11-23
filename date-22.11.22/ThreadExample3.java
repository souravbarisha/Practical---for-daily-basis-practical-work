package thread;

public class ThreadExample3 extends Thread{
public void run() {
	for(int i = 0; i<5; i++) {
		try {
			Thread.sleep(800);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
}
public static void main(String[] args) {
	ThreadExample3 t = new ThreadExample3();
	ThreadExample3 t1 = new ThreadExample3();
	ThreadExample3 t2 = new ThreadExample3();
	
/*	//t.start(); // // output will become simultaneously due to this
	t.run();
	t1.run();
	t2.run();
	*/
	
	// or we can get same output by join method
	t.start();
	try {
		t.join();
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
	t1.start();
	try {
		t1.join();
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
	t2.start();
}
}

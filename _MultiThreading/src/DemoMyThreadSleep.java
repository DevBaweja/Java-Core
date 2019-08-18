
public class DemoMyThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThreadYeild Th1 = new MyThreadYeild("First");
		// actually we only need constructor
		// Derived class object and Derived class Ref
		
		Thread Th2 = new MyThreadYeild("Second");
		// Derived class object and Base class Ref
	}

}

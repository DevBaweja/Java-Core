
public class MyThreadSleep extends Thread {

	MyThreadSleep() // constructor
	{
		// super.start();  calling of run method ie Thread class method
	}
	
	
	MyThreadSleep(String name) // parametric constructor
	{
		super.setName(name);
		// super.start(); we will do it in main
	}
	
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(super.getName()+"\t"+i);
			try {
				super.sleep(2000); // it is static method
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// suspend
	// resume

}

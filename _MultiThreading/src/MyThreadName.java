
public class MyThreadName extends Thread{

	public MyThreadName(String name) // making parametric constructor
	{
		super(name);
		// calling of the start of thread
		// which will internally call run method
		super.start();
		// super.setName(name);
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(super.getName()+"\t"+i);
		
		// return name of the thread
	}
	
}

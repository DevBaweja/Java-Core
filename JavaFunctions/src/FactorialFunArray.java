import java.util.Scanner;

public class FactorialFunArray {
	
	static int fac(int n)
	{
		int fac=1;
		for(int i=n;i>0;i--)
			fac *= i;
		return fac;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		
		// array 
		int []a = new int [n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter "+i+" element");
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i] + " factorial is : " + fac(a[i]));

	}

}

package Radix;
import java.util.Scanner;

public class BinaryInto10Int {
	
	static int convert(int n)
	{
		int res = 0,k=0;
		for(int temp=n;temp>0;temp /=10,k++)
		{
			int rem = temp%10; // will give 0 or 1 in reverse order 
			if(rem!=0 && rem!=1)
				return -1;
			res += rem*Math.pow(2,k);
		}
		return res;
	}
	public static void main(String[] args)
	{
		// in case of large int it will give input mismatch error
		// so we use method in which 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number");
		int n = sc.nextInt();
		
		System.out.println(convert(n));
	}
}

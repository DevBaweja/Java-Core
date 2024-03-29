package Radix;
import java.util.Scanner;

public class BinaryInto10Array {

	static int convert(String s,int[] a)
	{
		// Storing that string into array in reverse order
				for (int i = 0,j=a.length-1; i < a.length && j>=0 ; i++,j--) 
					{
						a[j] = Character.getNumericValue(s.charAt(i));
						if(a[j] != 0 && a[j] != 1)
							return -1;
					}
				int res=0;
				
				// mulitple 2 by index of array 
				for (int i = 0; i < a.length; i++) 
					res += a[i]*Math.pow(2,i);
				return res;
	}
	
	public static void main(String[] args)
	{
		// We will take string and convert it into array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number");
		String s = sc.next();
		int a[] = new int[s.length()];
		
		System.out.println(convert(s,a));
	}

}

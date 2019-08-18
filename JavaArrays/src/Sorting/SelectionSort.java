package Sorting;
// import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();

		// declaration of array
		int[] A = new int[n];

		for (int i = 0; i < A.length; i++)

		{
			System.out.println("enter " + i + " element");
			A[i] = sc.nextInt();
		}

	}

}

package interview_programs;

import java.util.Scanner;

public class O_Revers_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Array::");
		int n = sc.nextInt();

		System.out.println("Enter the " + n + " number of Array Element::");

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			

		}
		System.out.println("Reverse array are::");
		for(int i = a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}

	}

}

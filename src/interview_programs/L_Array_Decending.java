package interview_programs;

import java.util.Scanner;

public class L_Array_Decending {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();

		int a[] = new int[n];
		int i, j, temp = 0;

		System.out.println("Enter " + n + " number of array elements:  ");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("All array elements are: ");
		for (i = 0; i < n; i++) {
			System.out.println(" " + a[i]);
		}

		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("\nArray Elements in Ascending Order: ");
		for (i = 0; i < n; i++) {
			System.out.println(" " + a[i]);
		}
	}

}

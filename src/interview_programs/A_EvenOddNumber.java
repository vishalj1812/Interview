package interview_programs;

import java.util.*;

public class A_EvenOddNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number");

		int num = s.nextInt();

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				System.out.println(i+" Even Number");
			} else {
				System.out.println(i+" Odd Number");

			}

		}

	}
}

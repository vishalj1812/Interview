package interview_programs;

import java.util.*;

public class D_Factorial {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Eneter The Number");

		int num = s.nextInt();

		int Fact = 1;

		for (int i = 1; i <= num; i++) {

			Fact = Fact * i;
		}

		System.out.println(Fact);
	}

}

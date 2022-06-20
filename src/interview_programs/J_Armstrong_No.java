package interview_programs;

import java.util.Scanner;

public class J_Armstrong_No {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int no = sc.nextInt();//153
		sc.close();

		int t1 = no;
		int length = 0;

		while (t1 != 0) {    
			length = length + 1;
			t1 = t1 / 10;

		}

		int t2 = no;
		int arm = 0;
		int rem;
		
		while (t2 != 0) {
			int mul = 1;
			rem = t2 % 10;

			for (int i = 0; i <= length - 1; i++) {

				mul = mul * rem;

			}
			arm = arm + mul;
			t2 = t2 / 10;
		}
		if (arm == no) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}

	}

}

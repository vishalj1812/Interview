package interview_programs.copy;

import java.util.Scanner;

public class E_Revers_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr The Number");
		int num = sc.nextInt();
		int temp=num;
		int rem, rev=0;
		while(temp!=0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		if(num==rev) {
			System.out.println(num+" is palindrom number");
		}else {
			System.out.println(num+" is nut palindrom number");
		}
	}

}

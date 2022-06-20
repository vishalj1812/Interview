package interview_programs;

import java.util.Scanner;

public class E_Revers_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enetr The Number");
		int num=sc.nextInt();
		
		int rev=0, rem;
		int temp = num;//456
		
		while(temp!=0) {//4
			
			rem=temp%10;//4
			rev= rev*10+rem;//65*10+4=654
			temp=temp/10;//4
		}
		
		System.out.println(rev);

		if (num==rev) {
		System.out.println(num+" is Palindrome number");
		}else {
		System.out.println(num+" Is not pelindrom number");
		}
	}
}
		

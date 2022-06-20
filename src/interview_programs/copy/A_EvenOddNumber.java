package interview_programs.copy;

import java.util.*;

public class A_EvenOddNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number");

		int num = s.nextInt();
		
		if (num%2==0) 
		{
			System.out.println(num+" is a even number");
		}else 
		{
			System.out.println(num+" is a odd number");
		}

		}

	}


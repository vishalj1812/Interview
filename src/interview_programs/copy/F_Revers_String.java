package interview_programs.copy;

import java.util.Scanner;

public class F_Revers_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Word to revers");
		String Name = sc.next();

		String str = Name;
		String rev = "";
		for (int i = str.length()-1; i >=0;  i--) {

			rev = rev + str.charAt(i);
		}
		
		if(rev.equals(Name)) {
			System.out.println(Name+" is a palindrom string");
		}else {
			System.out.println(Name+" is not a palindrom string");
		}
	}
}

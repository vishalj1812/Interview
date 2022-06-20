package interview_programs;

import java.util.Scanner;

public class F_Revers_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Word to revers");
		String Name = sc.next();
		
		String org_name= Name;

		int leng = Name.length();
		System.out.println(leng);
		String rev = "";

		for (int i = leng - 1; i >= 0; i--) {

			rev = rev + Name.charAt(i);
		}

		if (rev.equals(org_name)) {
			System.out.println(Name + "  is pelindrom");
		} else {
			System.out.println(Name + " is not pelindrom");
		}
	}

}

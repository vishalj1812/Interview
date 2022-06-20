package interview_programs;

public class H_Revers_String_By_Word {

	public static void main(String[] args) {

		String s = "Hello Java With Selenium";
		String n = " ";
		String[] s1 = s.split("//s");//{Hello, Java, With, Selenium}
		for (String t : s1) {

			StringBuilder sb = new StringBuilder(t);
			sb.reverse();
			
			n =n + sb + " ";
		}
		System.out.println(n);
	}

}

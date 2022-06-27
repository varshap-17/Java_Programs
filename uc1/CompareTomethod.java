//As a fan of geometry, I want to compare two lines based on the end points
//So that I know one line is equal, greater or less than the other line.

package samples;

public class CompareTomethod {
	public static void main(String[] args) {
		String s1="hello";
		String s2="hai";
		String s3="hello";
		String s4="meklo";
		String s5="flag";
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println(s2.compareTo(s4));
	}
}

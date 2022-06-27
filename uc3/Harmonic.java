import java.util.*;

public class Harmonic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=sc.nextInt();
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of common difference d:");
		int d=sc.nextInt();
		double result;
		System.out.println("The harmonic nth term is:");
		for(int i=0; i<=n; i++) {
			result=(double) 1/(a+(i*d));
			System.out.println(result+"");
		}
	}
}

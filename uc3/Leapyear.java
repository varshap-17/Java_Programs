import java.util.Scanner;
public class Leapyear {
	
	private static Scanner sc;
	public static void main(String[] args) {
		int year;
		sc=new Scanner(System.in);
		System.out.println("\n Please enter the year:");
		year=sc.nextInt();
		
		if((year%400==0) || ((year%4==0) &&(year%100!=0))) {
			System.out.println(" is a leap year" +year);
		}else
				System.out.println("is not a leap year" +year);
		}
			
	}

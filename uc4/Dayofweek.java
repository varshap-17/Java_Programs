package Logicalexamples;

public class Dayofweek {
	
	public static void main(String[] args) {
		int day=17;
		int month=6;
		int year=1998;
	
		int y=year-(14-month)/12;
		int x=y+y/4-y/100+y/400;
		int m=month+12*((14-month)/12)-2;
		int d=(day+x+(31*m)/12)%7;
	 
		System.out.println("day of week = "+ d);
	     
	}
}


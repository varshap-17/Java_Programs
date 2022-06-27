package Logicalexamples;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		int choice;
		boolean flag=true;
		float celsius,fahrenheit,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Celsius-Fahrenheit \n 2.Faherenheit-Clesius \n 3.Exit");
		choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter celsius:");
				celsius=sc.nextFloat();
				result=(celsius*9/5)+32;
				System.out.println("Faherheit value = "+result);
				break;
		case 2: System.out.println("Enter Fahernheit:");
				fahrenheit=sc.nextFloat();
				result=(fahrenheit-32)*5/9;
				System.out.println("Celsius value = "+result);
				break;
		case 3:flag=false;
		default: System.out.println("Enter valid choice");
		break;
		}
	}
}

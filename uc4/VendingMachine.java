package Logicalexamples;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		int i=0;
		int total=0;
		int[] notes= {1000,500,100,50,10,5,2,1};
		int money,rem;
		System.out.println("Enter amount:");
		Scanner sc=new Scanner(System.in);
		money=sc.nextInt();
		if(money>=notes[i]) {
			int calnotes;
			calnotes= money/notes[i];
			rem=money%notes[i];
			money=rem;
			total += calnotes;
			System.out.println(notes[i]+ " Notes---> " + calnotes);
		}
	}
}

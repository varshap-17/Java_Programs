package Logicalexamples;

import java.util.Scanner;
public class Couponnumbers {
	private static final Scanner coupon=null;
	public static boolean isPresent (int a[], int num) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==num) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("how many random number do you \r\n" + "need to generate a distinct coupon numbers?");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int randomNum=0;
		int arr[]=new int[size];
		boolean ret;
		for(int i=0; i<arr.length; i++) {
			randomNum=coupon.nextInt(100);
			ret=isPresent(arr,randomNum);
			if(ret!=true) {
				arr[i]=randomNum;
			}else {
				--i;
			}
		}
		System.out.println("the random number generated are:");
		for(int i=0; i<arr.length; i++) {
			System.out.println("" +arr[i]);
		}
	}
}

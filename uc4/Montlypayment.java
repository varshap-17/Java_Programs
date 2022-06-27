package Logicalexamples;

public class Montlypayment {
	public static void main(String[] args) {
		float principle=2400;
		float year=4;
		float rate=2;
		float n=12*year;
		float r=rate/(12*100);
		float payment=(float)((principle*r)/(1-Math.pow(1+r, n)));
		System.out.println("Payment using compound interest = " +payment);
	}
}

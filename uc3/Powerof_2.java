
public class Powerof_2 {
	public static void main(String[] args) {
		int n=31;
		int i=0;
		int power=1;
		System.out.println("powers of 2 that are less than 2^" +n);
		while(i<=n) {
            System.out.println("2^" + i + "="+ power);
            power=power*2;
            i++;
	}
}
}	

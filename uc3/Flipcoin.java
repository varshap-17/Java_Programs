
public class Flipcoin {
	public static void main(String[] args) {
		double coin=Math.floor(Math.random()* 10) % 2;
		if(coin==0) {
			System.out.println("tails");
		}else
			System.out.println("heads");
	}
}

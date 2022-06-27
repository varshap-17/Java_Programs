//Ensure the player gets exact Winning position 100 

package samples;

public class Exactposition {
		public static void main(String[] args) {
			double exact_max=100;
			double die=Math.floor(Math.random()*150);
			System.out.println("die = " +die);
		
			if(die!=exact_max ) {
			System.out.println("player stays in the same previous position till the player gets the exact number");
	    }	else
			System.out.println("die rolled is equal to 100");
		}
}

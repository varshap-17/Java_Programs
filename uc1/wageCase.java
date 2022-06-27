//Solving using Switch case Statement

package samples;

public class wageCase {
		public static final int fulltimehr=1;
		public static final int parttimehr=2;
		public static final int wageperhr=20;
		
		public static void main(String[] args) {
			int emphrs=0;
			int empwage=0;
			int empCheck=(int) Math.floor(Math.random()*10) % 3;
			switch(empCheck) {
			case fulltimehr:
				emphrs=8;
				break;
			case parttimehr:
				emphrs=4;
				break;
			default:
				emphrs=0;
			} 
			empwage = emphrs*wageperhr;
			System.out.println("empwage:" + empwage);
    }
}

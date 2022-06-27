//Calculating wages for a month

package samples;

public class WageperMonth {
	public static void main(String[] args) {
		int wageper_month=0;
		int wageperhr=20;
		int fulldayhr=8;
		int workingdayper_month=20;
		int wageper_day=0;
		
		wageper_day = wageper_day+(wageperhr*fulldayhr);
		System.out.println("wageper_day =" + wageper_day );
		
		wageper_month=wageper_day*workingdayper_month;
		System.out.println("wageper_month =" + wageper_month );
	}
}

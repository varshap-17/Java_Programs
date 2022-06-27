//Calculate wages till a condition of total working hours
//or days is reached for a month

package samples;

public class wagesCondition {
	public static void main(String[] args) {
		int totalworkinghrs=100;
		int wageperhour=20;
		int totalsum=0;
		
		for(int i=1; i<=totalworkinghrs; i++) {
			
			totalsum=totalsum+(i*wageperhour);
		}
		System.out.println("totalsum =" + totalsum );
	}
}

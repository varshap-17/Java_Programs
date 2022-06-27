
public class Quadratic {
	public static void main(String[] args) {
		double a=3, b=8, c=5;
		
		double delta = b*b-4*a*c;
		System.out.println("Delta = "+delta);
		
		if(delta>0) {
		double root1 = (-b+ Math.sqrt(delta))/(2*a);
		double root2 = (-b+ Math.sqrt(delta))/(2*a);
		System.out.println("root1 ="+root1);
		System.out.println("root2 ="+root2);
	    }
		else if(delta==0) {
			double root1=-b/(2.0*a);
			System.out.println("root1 =" +root1);
		}
		else {
			System.out.println("Roots are not real");
		}
	}
}
//As a fan of geometry, I want to model a line based on a point consisting of (x,y) co-ordinates
//using the Cartesian system, so that i can calculate its length.

package samples;

public class Length {
		public static void main(String[] args) {
			double x1=3.5;
			double x2=6.5;
			double y1=2.5;
			double y2=8.5;
			double diff=x2-x1;
			double diff2=y2-y1;
			double lengthofline=Math.sqrt((diff*diff) + (diff2*diff) );
			System.out.println(lengthofline);
		}
}



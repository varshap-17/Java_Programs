// Check Employee is present or absent.

package samples;

public class EmpPresAbsent {
      public static void main(String[] args) {
    	  //constants
    	  int IS_FULL_TIME = 1;
    	  		//computation
    	  double empid = Math.floor(Math.random()*2) ;
    	  
    	  if(empid == IS_FULL_TIME)
    		  System.out.println("Employee is present");
    	  else
    		  System.out.println("Employee is absent");
      }
}

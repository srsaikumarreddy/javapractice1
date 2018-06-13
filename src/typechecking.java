import java.util.*;
import java.lang.*;
public class typechecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("enter the string");
	      Scanner s=new Scanner(System.in);
	      String str=s.next();
	      char c=str.charAt(0);
	      if(Character.isDigit(c))
	        System.out.println("Digit");
	      else if(Character.isUpperCase(c))
	    	  System.out.println("Uppercase letter");
	      else  if(Character.isLowerCase(c))
	    	  System.out.println("LowerCase letter");
	      else
	    	  System.out.println("Special Symbol");
	   
	   }

}

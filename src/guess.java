import java.util.*;
public class guess {

	public static void main(String[] args) {
		
		 System.out.println("enter the number");
	      int ll=1;
	      int ul=100;
          int target=69;
          Scanner s=new Scanner(System.in);
          int num=s.nextInt();
          int flag=1000;
	      while(true)
	      {
	    	   if(num==target)
	    	   {
	    		    System.out.println("Number Guessed correctly");
	    		    flag=100;
	    		    System.exit(1);
	    	   }
	    	 
	    		  if(num>target)
	    		  {
	    			   System.out.println("Number guessed is more than original number");
	    			   ul=num;
	    			   System.out.println("Enter  between "+ ll + " and "+ ul);
	    			    num=s.nextInt();
	    		  }
	    	   if(num<target)
	    		  {
	    			   System.out.println("Number guessed is less than original number");
	    			   ll=num;
	    			   System.out.println("Enter  between "+ ll + " and "+ ul);
	    			   num=s.nextInt();
	    		  }
	      }
	    	  
	    	  
	      

	}

}

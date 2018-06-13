import java.util.*;
public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter the string");
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int len=str.length();
       String rever=new String();
       for(int i=len-1;i>=0;i--)
       {
    	    char c=str.charAt(i);
    	    rever+=c;
    	    
       }
		System.out.println(rever);
	}

}

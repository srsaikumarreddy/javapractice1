import java.util.*;
public class stackroute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Enter the string and number ");
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	int num=s.nextInt();
	String sub=str.substring(str.length()-num);
	
	for(int i=0;i<num;i++)
	{ 
		str+=sub;
	}
	
	System.out.println(str);
			
	}

}

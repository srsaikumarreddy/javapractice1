import java.util.*;
public class loopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int numm=s.nextInt();
		for(int i=1;i<=numm;i++)
		{
			 for(int j=1;j<=i;j++)
			 { 
				 System.out.print(i);
			 }
		}
   
		 
	}

}

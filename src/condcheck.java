import java.util.*;
public class condcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER A NUMEBER :");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num>20 && num<30 && num%2==1)
			System.out.println("Tom");
		else if(num>20 && num<30 && num%2==0)
			System.out.println("Jerry");
		else System.out.println("Not a number between 20 and 30");		
		
		
		
	}

}

import java.util.*;

public class Sum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the no of numbers ");
       Scanner s=new Scanner(System.in);
       int times=s.nextInt();
       int k=0;
       int arr[];
       arr=new int[times];int sum =0;
       
       System.out.println("Enter the numbers");
       for(int i=0;i<times;i++)
       { 
           int num=s.nextInt();
    	   sum=sum+num;
       }
       System.out.println("The sum is " + sum);
		
	}

}

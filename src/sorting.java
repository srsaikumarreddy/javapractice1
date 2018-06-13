import java.util.*;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
         int val=s.nextInt();
         int num=val;
         String x=Integer.toString(num);
         int len=x.length();
         
         int i;
         int k=0;
         int arr[];
         int evensum=0;
         arr=new int[len];
         while(num>0)
         {
        	  i=num%10; 
        	  if(i%2==0)
        		  evensum+=i;
        	   arr[k++]=i;
           	  num=num/10;
         }
         Arrays.sort(arr);
         System.out.println("Sorted order is ");
         for(int j=len-1;j>=0;j--)
         {
        	  System.out.print(arr[j]);
         }
         System.out.println((evensum>15?true:false));         
      }

}

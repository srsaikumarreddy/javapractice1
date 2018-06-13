import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.Math;

public class Palindrome {

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
         arr=new int[len];
         int evensum=0;
        while(num>0)
         {
        	  i=num%10;
        	  if(i%2==0)
        		evensum+=i;
        	
        	   arr[k++]=i;
           	  num=num/10;
         }
       int rev = 0;
       for(int j=0;j<len;j++)
       { 
    	   rev = rev * 10 + arr[j];
       }
   if(val!=rev)
	   System.out.println("Not a Palindrome");
   else if(val==rev && evensum<25) 
	   System.out.println("Palindrome and even sum less than 25");
   else 
	   System.out.println("Palindrome and even sum greater than 25");
	
}
}       	  
        
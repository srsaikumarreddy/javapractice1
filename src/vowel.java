import java.util.*;
public class vowel {

	public static void main(String[] args) {
		
		System.out.println("Enter the word: ");
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		int len=str.length();
		
		char c=str.charAt(0);
		if(!Character.isLetter(c)) {
			System.err.println("Not a letter");
			System.exit(1);}
		
		for(int i=0;i<len;i++)
		{   char x=str.charAt(i);
		if(x=='a' ||x=='e'||x=='i'||x=='o'||x=='u')
				System.out.println("Vowel");
			else
				System.out.println("Consonant");
				
		}

	}

}

package My.Java.Project;

import java.util.Scanner;

public class Vowel {
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet:");
		char alpha=sc.next().charAt(0);
		switch(alpha)
		{
		case 'a' : case 'e': case 'i' : case 'o': case 'u':
		{
			System.out.println("The entered alphabet is a vowel");
			break;
			
		}
		default:
			System.out.println("The entered alphabet is a consonant");
		}
		}
		

}

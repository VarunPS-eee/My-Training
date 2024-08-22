package My.Java.Project;

import java.util.Scanner;

public class SeasonSwitch {
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the season number:");
		int seas=sc.nextInt();
		
		switch(seas)
		{
			case 6 : case 7 :case 8 :case 9:
			{
				System.out.println("Rainy Season");
				break;
			}
			case 10: case 11 : case 12 :case 1:
			{
				System.out.println("Winter Season");
				break;
			}
			case 2 :case 3:case 4:case 5:
			{
				System.out.println("Summer Season");
				break;
			}
			default:
			{
				System.out.println("The entered input is not a season");
			}
			
		
	}
		
		
	}

}

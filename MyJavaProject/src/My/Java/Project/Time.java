package My.Java.Project;
import java.util.Scanner;

public class Time 
{
	
	
	public static void main(String []args)
	{
		
		int h,m,s;
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter hours :");
	h=sc.nextInt();
	System.out.println("Enter minutes :");
	m=sc.nextInt();
	System.out.println("Enter seconds :");
	s=sc.nextInt();
	System.out.println("-------------CLOCK-------------");
	
	
	try 
	{
	
	for(h=h;h<24;h++)
	{
		
		for(m=m;m<60;m++)
		{
			
			for(s=s;s<60;s++)
			{
				
				System.out.print(h+ " : "+m+ " : "+s+ "\r" );
				Thread.sleep(1000);
		
				}s=0;
		}m=0;
		
	}h=0;
	
	}catch(Exception e)
	{
		e.printStackTrace();	
		}
}
}



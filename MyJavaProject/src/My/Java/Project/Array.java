package My.Java.Project;

import java.util.Scanner;

public class Array {
	
	public static void main(String []args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[2][2];
		a[0][0]=21;
		a[0][1]=22;
		a[1][0]=23;
		a[1][1]=24;
		System.out.println("The 2d array values are : ");
		
		for(int r=0;r<2;r++)
			
		{
			for(int c=0;c<2;c++)
			{
				System.out.print(a[r][c]+"\t");
			}
			System.out.println("\n");
		}
		
		
		int b[]= {1,2,3,4,5,6};
		System.out.println("The 1d array values are : ");
		for (int i : b) {
			
			
			System.out.print( i+"\t");
			
		}
		
	}

}

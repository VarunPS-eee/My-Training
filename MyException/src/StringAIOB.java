
public class StringAIOB {
	
public static void main(String[]args ) 
{
	try {
	String[] s= {"Varun"};
	System.out.println(s[20]);
	}
	catch(StringIndexOutOfBoundsException se)
	{
		se.printStackTrace();
	}
	
}

}

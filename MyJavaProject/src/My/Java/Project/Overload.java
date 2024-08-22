package My.Java.Project;

public class Overload {
	
	public int add(int a,int b)
	{
		System.out.println("Method with 2 parameters");
		return a+b;
	}
	public double add(double d)
	{
		System.out.println("Method with 1 parameter");
		return (d+25.3);
	}
	public int add()
	{
		System.out.println("Method with 0 parameters");
		return 60+50;
	}
	public static void main(String args[]) 
	{
		Overload o=new Overload();
		
		System.out.println(o.add());
		System.out.println(o.add(20.0));
		System.out.println(o.add(30,40));
		
	}
	

}

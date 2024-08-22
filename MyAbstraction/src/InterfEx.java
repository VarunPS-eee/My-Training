
public class InterfEx {
	
	public static void main(String []args)
	{
		Test t=new Test();
		t.display();
		
	}
}
interface I1
{
	void display();
	
}
 class Test implements I1
 {
	 public void display()
	 {
		 System.out.println("Show method called");
	 }
	 
 }
package My.Java.Project;

public class TestOver extends TestOverride {
	
	public void add()
	
	{
		super.add();
		System.out.println("Sub class method");
		
	}
	public static void main(String args[])
	{
		TestOver t=new TestOver();
		t.add();
		
		
	}

}

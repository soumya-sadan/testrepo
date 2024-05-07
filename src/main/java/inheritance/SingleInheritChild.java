package inheritance;

public class SingleInheritChild extends SingleInheritParent
{

	public void method2()
	{
		System.out.println("This is child method");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    
		SingleInheritChild obj = new SingleInheritChild();	
		obj.method1();
	}
	

}

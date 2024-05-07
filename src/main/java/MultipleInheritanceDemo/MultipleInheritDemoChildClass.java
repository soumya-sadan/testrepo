package MultipleInheritanceDemo;

public class MultipleInheritDemoChildClass implements MultipleInheritDemoInterface1, MultipleInheritDemoInterface2 
{

	@Override
	public void displayinterface2() 
	{
		// TODO Auto-generated method stub
		System.out.println(" I am Interface2 method");

	}

	@Override
	public void displayinterface1() 
	{
		// TODO Auto-generated method stub
		System.out.println(" I am Interface1 method");
	}

public static void main(String args[])
{
	MultipleInheritDemoChildClass obj = new MultipleInheritDemoChildClass();
	obj.displayinterface1();
	obj.displayinterface2();
	
}

}





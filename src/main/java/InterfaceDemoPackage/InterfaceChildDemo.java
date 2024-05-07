package InterfaceDemoPackage;

public class InterfaceChildDemo implements InterfaceDemo 
{

	public void display() //interface implemetation goes here
	 {
		// TODO Auto-generated method stub
     System.out.println("Interface");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InterfaceChildDemo obj = new InterfaceChildDemo();
		obj.display();
	}

}

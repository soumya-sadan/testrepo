package package1;

public class AccessModifierDemo1 
{
	
	public void publicmethod()
	{
	System.out.println("I am public");
	}
	private void privatemethod()
	{
	System.out.println("I am private");
	}
	protected void protectedmethod()
	{
	System.out.println("I am protected");
	}
	void defaultmethod()
	{
	System.out.println("I am default");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AccessModifierDemo1 obj= new AccessModifierDemo1();
		obj.publicmethod();
		obj.privatemethod();
		obj.protectedmethod();
		obj.defaultmethod();
		

	}

}

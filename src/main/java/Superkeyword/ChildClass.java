package Superkeyword;

public class ChildClass extends ParentClass 
{
	String name = "Super Keyword Demo - printing from child class";
	
	public void display()
	{
		System.out.println(name);
		System.out.println(super.name); //'super' used to refer parent's instance variable
	}
	
	public void addnumchild()
	{
		int c = 0;
		int a=55;
		int b = 25;
		c = a+b;
		System.out.println("Sum is " + c);
		super.addnum(); //'super' used to refer parent's instance method
	}
	
	ChildClass()
	{
		super("test"); ////'super' used to refer parent's parameterized construcor
		System.out.println("Constructor from Child");
		
	
	}

	public static void main(String[] args) 
	{
		
    ChildClass obj = new ChildClass();
    obj.display();
    obj.addnumchild();
   
    
	}

}

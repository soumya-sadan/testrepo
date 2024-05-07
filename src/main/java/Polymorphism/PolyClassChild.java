package Polymorphism;

public class PolyClassChild extends PolyClassParent
{
	public void add()
	{
		int a=10;
		int b=10;
		System.out.println("Sum is : " + (a+b));
		super.add();//method overriding
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		PolyClassChild objc = new PolyClassChild();
		objc.add();
	}

}

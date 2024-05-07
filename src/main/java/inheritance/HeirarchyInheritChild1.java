package inheritance;

public class HeirarchyInheritChild1 extends HeirarchyInheritParent
{

			public void  methodchild1()
			{
				System.out.println("This is child 1 method 1 in multilevel");
			}		
		

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		HeirarchyInheritChild1 obj1 = new HeirarchyInheritChild1();	
		obj1.methodparent();
		obj1.methodchild1();
		
	}

}

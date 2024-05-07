package inheritance;

public class HeirarchyInheritChild2 extends HeirarchyInheritParent
	
{

		public void methodchild2()
		{
			System.out.println("This is child 2 method 2 in multilevel");
		}		
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HeirarchyInheritChild2 obj2 = new HeirarchyInheritChild2();	
		
		obj2.methodparent();
		obj2.methodchild2();
	}

}

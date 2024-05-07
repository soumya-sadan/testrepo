package inheritance;

public class MultiLevelChild2 extends MultiLevelChild1
{

	public void displaychild2()
	
	{
		System.out.println("I am multilevel child 2 ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelChild2 objch2 = new MultiLevelChild2();
		objch2.displayparent();
		objch2.displaychild1();
		objch2.displaychild2();
	}

}

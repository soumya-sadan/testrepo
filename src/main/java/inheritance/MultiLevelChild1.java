package inheritance;

public class MultiLevelChild1 extends MutiLevelParent
{
	public void displaychild1()
	{
		System.out.println("I am multilevel child 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelChild1 objch1 = new MultiLevelChild1();
		objch1.displayparent();
     
	}

}

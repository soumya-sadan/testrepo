package AggregationDemo;

public class AggregateClassB 
{

	String s1;
	int b=10;
	AggregateClassA ag;

	AggregateClassB(String s1, int b, AggregateClassA ag)
	{
		this.s1 = s1;
		this.b=b;
		this.ag=ag;
		
	}
	
	public void display()
	{
		System.out.println("string from class a : " + ag.s + "number from class a: " + ag.age);
		System.out.println("number from class b: " + b);
		System.out.println("string from class b: " + s1);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AggregateClassA obja = new AggregateClassA("abc", 12);
		AggregateClassB objb = new AggregateClassB("def",34,obja);
		objb.display();
	}

}

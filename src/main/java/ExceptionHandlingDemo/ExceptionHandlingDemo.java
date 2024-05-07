package ExceptionHandlingDemo;

public class ExceptionHandlingDemo 
{
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			int a=100;
			int b=0;
			
			int c = a / b;
			System.out.println("hello");
			System.out.println(c);
		}
		//catch(ArithmeticException obj)
		
		//{
			//System.out.println("error occured");
		//}
		finally
		{
			System.out.println("Execution success");
			System.out.println();
			
		}
	}

}

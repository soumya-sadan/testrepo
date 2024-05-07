package ExceptionHandlingDemo;

public class ExceptionThrowDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int age=19;
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else
			
		{
			throw new ArithmeticException("No eligible");
		}

	}

}

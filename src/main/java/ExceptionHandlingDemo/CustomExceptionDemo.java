package ExceptionHandlingDemo;

public class CustomExceptionDemo 
	
	{
		public static void main(String[] args) throws MyException 
		{
			// TODO Auto-generated method stub
			
			int age=12;
			if(age>=18)
			{
				System.out.println("Eligible");
			}
			else
				
			{
				throw new MyException("Not eligible");
			}

		}

	}
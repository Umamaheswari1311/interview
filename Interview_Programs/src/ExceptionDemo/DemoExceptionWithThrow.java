package ExceptionDemo;

public class DemoExceptionWithThrow {
	
	public static void exceptionHandling()
	{
		try
		{
		
			throw new CustomizeException("Database Connection failed");
		}
		
		//int i=0;
			catch(CustomizeException e)
			{
				e.printStackTrace();
				//System.out.println(e.toString());
				//System.out.println(e.getMessage());
				System.out.println("Retry to connect with Database");
			}
			
			finally
			{
				System.out.println("close the Database connection");
			
		    }
	
	}
	public static void multipleException()
	{
		try {
			int check=1/0;
			System.out.println(check);
		} 
				 
 
      catch (ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println("Don't divide by zero");
		}
		
    catch (NullPointerException e) {
			
			e.printStackTrace();
			System.out.println("null point");
		}
		catch (Exception e) {
			  
			  e.printStackTrace(); System.out.println("Don't divide by zero"); 
	}
	}
	public static void main(String[] args) {
		//exceptionHandling();
		multipleException();
	}
}

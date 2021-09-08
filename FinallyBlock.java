package Exception;

public class FinallyBlock {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try {
			System.out.println(" Inside the try block");
			int data =20/0;
			System.out.println(" data");
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println(" finally block is always executed");
			
		}
		System.out.println(" rest of the code");

	}

}

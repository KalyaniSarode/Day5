package Exception;

public class JavaException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= new int[5];
			a[5]=20/0;
			System.out.println(a[10]);
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occures");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(" Array Exception Occures");
		}
		System.out.println(" Rest Of The Code");
	}
			
		
		

	

}

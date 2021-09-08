package Exception;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="23KS";
		try {
			Integer number = Integer .valueOf(str);
			System.out.println(" number");
			
		}
		catch(NumberFormatException ex) {
			ex.printStackTrace();
			
		}
		

	}

}

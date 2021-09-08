package Exception;

public class NullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s1 = "";
			System.out.println(" s1.lentgh()");
			
		}
		catch(NullPointerException e) {
			System.out.println(" String is empty.");
		}


	}

}

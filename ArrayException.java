package Exception;
import java.util.*;


public class ArrayException 
{

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		
      throws ArrayIndexOutOfBoundsException
      {
		  int i;
          Scanner s=new Scanner (System.in);
    	  int arr[]=new int[5];
    	  try {
    		  while(true) {
    			  if(i==5) 
    			  {
    				  throw new ArrayIndexOutOfBoundsException();
    				  arr[i++]=s.nextInt();
    				  
    				  
    			  }
    		  }
    		  catch(ArrayIndexOutOfBoundException e) 
    		  {
    			  System.out.println(" Array Bound Exceeded..\nTry Again");
    		  }
    	  }
      }
    	  
    	  
    	  
      
	



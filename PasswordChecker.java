import java.util.Scanner;

public class PasswordChecker 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );
	    
	 
	    
	    System.out.println("Enter password:");
	    String password = scan.nextLine();
	    
	    if (password.equals("Snowflake47") )
	    {
	    	System.out.println("Corect login");
	    }
	    else
	    {
	    	System.out.println("Incorrect username or password please try again");
	    }

	}
	
	
    

}

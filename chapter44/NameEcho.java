import java.util.Scanner;

public class NameEcho 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );

	    
	    
	    System.out.println("What is your name");
	    String name = scan.nextLine();
	    
	    int index = name.indexOf("Holmes");
	    
	    String subString = name.substring(index, name.length());
	    
	    String upperCase = subString.toUpperCase();
	    
	    
	    String trim = name.trim();
	    
	    
	    
	   String finalName = trim.substring(0, 8) + " " +upperCase;
	    
	   // .toUpperCase()
	   
	  
	   
	    System.out.println(finalName);
	    
	}

}

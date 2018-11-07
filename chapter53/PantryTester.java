import java.util.Scanner;

public class PantryTester 
{
	  public static void main ( String[] args )
	  {
	    Scanner scan = new Scanner( System.in );
		    
	    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
	    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
	    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 10 );

	    Pantry hubbard = new Pantry( goose, apple, rhub );
	    System.out.println( hubbard );
	    
	    System.out.println("Enter the jam you want(1,2,or 3):");
	    Integer selection = scan.nextInt();
		    
	    System.out.println("Enter amount to spread:");
	    Integer spreadAmount = scan.nextInt();
		  
	    
	    

	    hubbard.select(selection);
	    hubbard.spread(spreadAmount);
	    System.out.println( hubbard );


	  }
	}


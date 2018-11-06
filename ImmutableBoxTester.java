
public class ImmutableBoxTester 
{
	public static void mains ( String[] args)
	{
		ImmutableBox box = new  ImmutableBox( 2.5, 5.0, 6.0 ) ;

	     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

	     System.out.println( "length: " + box.length + " height: " + box. height +
	                         "width:  " + box.width )  ;

	}

}

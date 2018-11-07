
public class ImmutableBox 
{
	
	private double width;
	private double height;
	private double length;
	
	public ImmutableBox(double width, double height, double length)
	{
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	ImmutableBox ( ImmutableBox oldBox)
	{
		
	}
	
	
	public double length()
	{
		return length;
	}
	public double height()
	{
		return height;
	}
	public double width()
	{
		return width;
	}
	
	
	ImmutableBox biggerBox( ImmutableBox oldBox )
	{

	  return new ImmutableBox( 1.25*oldBox.width(),1.25*oldBox.length(),1.25*oldBox.height());
	  
	}
	
	public boolean nests( ImmutableBox outsideBox )
	{
	   if (oldBox.length()<outsideBox.length() && oldBox.height()<outsideBox.height() && oldBox.width()<outsideBox.width())
		{
			return true;
		}
		else
		{
			return false;
		}
	
	private double faceArea()
	{
		return height*width;
	}
	
	private double sideArea()
	{
		return width*length;
	}
	
	private double topArea()
	{
		return height*length;
	}
	
	
	
	public double volume()
	{
		return width*height*length;
	}

	public double area()
	{	
		return 2*(height * width + height * length + width * length);
	}
	
}

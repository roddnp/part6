

public class Cone 
{
	
	double height;
	double radius;
	
	public Cone( double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	public double area()
	{
		return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius) );
	}
	
	public double volume()
	{
		return Math.PI*radius*radius*height/3.0;
	}
	
	public double slantHeight()
	{
		return Math.sqrt(radius * radius + height * height);
	}
	
	public double angle()
	{
		return Math.atan(radius/height);
	}

}

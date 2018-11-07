
public class Cylinder 
{
	double height;
	double radius;
	
	public Cylinder( double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	public double volume()
	{
		return Math.PI*radius*radius*height;
	}
	
	public double surfaceArea()
	{
		//2πrh+2πr2
		
		return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
	}
	
	

}

import java.util.Scanner;

public class Unlucky 
{

	static int num;

	public static boolean unlucky(int num)
	{
		 
	        while(num>0)
	        {
	        	if(num%10==0)
	            {
	                if (num/10 == 13)
	                {
	                	System.out.println("This is an unlucky number");
	                	return true;
	                }
	            }
	                num=num/10;
	        }
	        
	        
	        return false;
	     
	}
	
	public static void main (String[] args)
	{
		System.out.println("Enter your number:");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        
            if(unlucky(num))
            {
                System.out.println(num);
            }
        
	}

}

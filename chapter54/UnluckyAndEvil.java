import java.util.Scanner;

public class UnluckyAndEvil 
{
	int sum;
	static int num;
	public static boolean odious(int num)
	{
		 int sum=0;
	        while(num>0)
	        {
	            if(num%2==1)
	            {
	                sum++;
	            }
	                num=num/2;
	        }
	        if(sum%2==1)
	        {
	            System.out.print("odious number ");
	            return true;
	        }
	        else
	        {
	            System.out.println("evil number ");
	            return false;
	        }
	}
	
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
            if(unlucky(num) && odious(num))
            {
                System.out.println(num);
            }
        
	}

}

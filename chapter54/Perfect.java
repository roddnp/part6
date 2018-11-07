import java.util.Scanner;

public class Perfect 
{
	static int num;
	public static boolean perfect(int num)
	{
		 int sum=0;
	        while(num>0)
	        {
	        	for (int i =num-1;i>0;i-- )
	        	{
	        		if(num%i==0)
	 	            {
	 	                sum+=i;
	 	            }
	        	}
	           
	        }
	        if(sum==num)
	        {
	            System.out.println("this is a perfect number ");
	            return true;
	        }
	        else
	        {
	            System.out.println("not a perfect number ");
	            return false;
	        }
	        
	}
	
	public static void main (String[] args)
	{
		System.out.println("Enter your number:");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        
            if(perfect(num))
            {
                System.out.println(num);
            }
        
	}

}

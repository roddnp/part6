import java.util.Scanner;

public class Odious 
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
	
	public static void main (String[] args)
	{
		System.out.println("Enter your number:");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        
            if(odious(num))
            {
                System.out.println(num);
            }
        
	}

}

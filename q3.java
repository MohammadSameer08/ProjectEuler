
import java.util.Scanner;
public class q3
{

	public static boolean isprime(long n)
	{
		 boolean flag=true;
		 for(long i=2;i<Math.sqrt(n);i++)
		 {
			 if(n%i==0)
			 {
				 flag=false;
				 break;
			 }
		 }
		if(flag)
			return true;
		else
			return false;
		}
    
public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	long n=sc.nextLong();
        long  max=0;    
    	for(long i=2;i<Math.sqrt(n);i++)
    	{
    		if(n%i==0)
    		{
    			if(isprime(i))
    			{
                    System.out.print("  "+i);
    				max=i;
    	     	}
    			
    		}
    	}
    System.out.println();
    System.out.println(max);
    
    }
}

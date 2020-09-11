
public class q10 
{
	public static boolean isprime(long n)
	{
		 int flag=1;
		 for(long i=2;i<Math.sqrt(n);i++)
		 {
			 if(n%i==0)
			 {
				 flag=0;
				 break;
			 }
		 }
		if(flag==1)
			return true;
		else
			return false;
		}
    
	public static void main(String[] args)
	{
	int sum=0;
      for(int i=2;i<2000000;i++)
      {
    	  if(isprime(i))
    	  {
    		  sum=sum+i;
    	  }
      }
	
	System.out.println(sum);
	}
}

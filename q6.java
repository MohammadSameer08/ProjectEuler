public class q6 
{
   public static void main(String args[])
   {
	    int sum1=0, sum2=0,n=100;
	   for(int i=1;i<=n;i++)
	   {
	                    sum1+=(int)Math.pow(i,2);	                                             
		                sum2+=i;                          
	   }
	   sum2=(int) Math.pow(sum2,2);
   	
	
    	System.out.println(sum1);
	    System.out.println(sum2);
	    System.out.println("Diff="+(sum2-sum1));
   }
 
}

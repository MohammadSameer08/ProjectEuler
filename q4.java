public class q4
{
	public static boolean ispalindrom(int n)
	{
		int num=n;
	    int r=0;
	    int d;
		while(num!=0)
		{
		  	d=num%10;
		    r= (r*10)+d;
		    num=num/10;
		}
		if(r==n)
			return true;
		else
			return false;
		}
  public static void main(String args[])
  {
	     int max=0;
	     int product;
	     int m=0,n=0;
	     for(int i=100;i<=999;i++)
	     {
	    	 for(int j=100;j<=999;j++)
	    	 {
	    		 product=i*j;
	    //	 System.out.println(i+"x"+j+"="+product);
	    		   if(ispalindrom(product))
	    		   {
	    			   max=product;
	    		       m=i;
	    		       n=j;
	    		   }
	    	 
	    	 }
	    	 
	     }

 System.out.println(m+"x"+n+"="+max);
  }
	
}

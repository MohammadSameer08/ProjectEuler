import java.util.*;
public class q6 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int sum1=0;
    	int sum2=0;
    	int n=100;
	   for(int i=1;i<=n;i++)
	   {
	                    sum1=sum1+(int)Math.pow(i,2);	                                             
		                sum2=sum2+i;                          
	   }
	   sum2=(int) Math.pow(sum2,2);
   	
	
	System.out.println(sum1);
	  System.out.println(sum2);
	  System.out.println("Diff="+(sum2-sum1));
   }
 
}

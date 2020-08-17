import java.util.*;
public class q5 {

	public static void main(String[] args)
	{
	int res=0;
	int k=0;
	int num=2000;
	int i=1;

	while(i<=20)
	{
	              if(num%i==0)
	              {
	            	k=i;
	            	if(k==20)
	            	{
	            		res=num;
	            	    break;
	            	}
	                  i++;              
	              }
	              else
	              {
	            	  num++;
	            	  i=1;
	              }
	
	}
	
System.out.println(res);
	}

}

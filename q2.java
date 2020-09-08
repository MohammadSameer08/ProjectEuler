import java.util.*;
public class q2
{
public static int series(int n)
{
	if(n==0)
		return 1;
	else if(n==1)
		return 2;
	else
		return series(n-1)+series(n-2);
	
}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
     int r;
     int sum=0;
     int n=sc.nextInt();
     for(int i=0;i<n;i++)
     {
    	 r=series(i);
    	 if(r%2==0)
    	 {
    		 sum+=r;
    	 }
    	 System.out.print(r+"  ");
     }
     System.out.println();
     System.out.println("sum="+sum);
	}

}

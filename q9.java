
public class q9 {

	public static void main(String[] args)
	{
	int p=1000;
	boolean flag=false;
	for(int a=1;a<p;a++)
	{
		for(int b=a+1;b<p;b++)
		{
			int c=1000-a-b;   //a+b+c=1000
		    if(a*a+b*b==c*c)
		    {
		    	flag=true;
		    	System.out.println(a*b*c);
		    }
		}
	}
		
	if(flag==false)
	{
		System.out.println("not found");
	}
	}

}

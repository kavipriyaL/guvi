import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player115
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+(int)Math.pow(r,2);
			n=n/10;
			
		}
		System.out.println(sum);
	}
}

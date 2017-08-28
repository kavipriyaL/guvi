import java.util.*;
import java.lang.*;
import java.io.*;
class Player106one
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String k[]=new String[n];
		for(int i=0;i<n;i++)
		k[i]=in.next();
		String h=in.next();
		int a=h.length(),c=0;
		for(int i=0;i<n;i++)
		{
			String b=k[i];
			if(b.length()!=a)
			c++;
		}
		System.out.println(c);
	}
}

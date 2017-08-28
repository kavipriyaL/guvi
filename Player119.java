import java.util.*;
import java.lang.*;
import java.io.*;
class Player119
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt(),sum=0;
		for(int i=n1;i<n2;i++)
		{
			String k=Integer.toString(i);
			StringBuffer br=new StringBuffer(k);
			String h=br.reverse().toString();
			if(k.equals(h))
			{
			 sum=sum+Integer.parseInt(k);
			}
		}
		System.out.println(sum);
	}
}

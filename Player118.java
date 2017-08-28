import java.util.*;
import java.lang.*;
import java.io.*;
class Player118
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String ss[]=s.split(" ");
		int m=0;
		String h="";
		for(int i=0;i<ss.length;i++)
		{
			String k=ss[i];
			int n=k.length();
			if(n>m)
			{
				m=n;
				h=k;
			}
		}
		System.out.println(h);
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;
class Player117
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		StringBuilder br=new StringBuilder(s);
		String ss=br.reverse().toString();
		for(int i=0;i<ss.length();i++)
		{
			char c=ss.charAt(i);
			System.out.print(c);
			if(i<ss.length()-1)
			System.out.print("-");
			
		}
	}
}

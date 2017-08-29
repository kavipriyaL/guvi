import java.util.*;
import java.lang.*;
import java.io.*;
class Player96
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char c=s.charAt(0);
		char c1=s.charAt(s.length()-1);
		int a1=Character.getNumericValue(c);
		int a2=Character.getNumericValue(c1);
		int k=a1+a2;
		System.out.println(k);
	}
}

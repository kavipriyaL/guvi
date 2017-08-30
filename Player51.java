
import java.util.*;
import java.lang.*;
import java.io.*;
class Player51
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=in.nextInt();
		Arrays.sort(a);
		System.out.println(a[1]);
	}
}

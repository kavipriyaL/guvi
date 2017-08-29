import java.util.*;
import java.lang.*;
import java.io.*;
class Player97
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int input=in.nextInt();
		int output=0;
		for(int i=1;i<=input;i++)
		{
			if(i%2!=0)
			output+=i;
		}
		System.out.println(output);
	}
}

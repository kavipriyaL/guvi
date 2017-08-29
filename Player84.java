import java.util.*;
import java.lang.*;
import java.io.*;
class Player84
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		ArrayList<String> al=new ArrayList<String>();
	            String sp[]=s.split(" ");
	            for(int i=sp.length-1;i>=0;i--)
	            al.add(sp[i]);
              	Iterator r=al.iterator();
	            while(r.hasNext())
		System.out.print(r.next()+" ");
	}
}

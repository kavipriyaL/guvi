import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player111
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int b[]=new int[n];
        int c=0;
        ArrayList aa=new ArrayList();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=in.nextInt();
        for(int i=0;i<n;i++)
        b[i]=in.nextInt();
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		if(a[i]==b[j])
        		{
        			aa.add(a[i]);
        			c++;	
        		}
        	}
        	for(int k=0;k<n;k++)
        	{
        		if(b[i]==a[k])
        		{
        			aa.add(b[i]);
        			c++;
        		}
        	}
        }
        	System.out.print(c+"(");
            Iterator r=aa.iterator();
            while(r.hasNext())
            {
            	System.out.print(r.next());
            }
            System.out.print(")");
      }
}

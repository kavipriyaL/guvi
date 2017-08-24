/* package whatever; // don't place package name! */

import java.util.*;
class Ideone1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	           Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		ArrayList al=new ArrayList();
		char c[]=s.toCharArray();
		int k=1;
		Arrays.sort(c);
		for(int i=0;i<c.length;i++)
	            {
	            
	    	for(int j=0;j<c.length;j++)
	    	{
	    	
	    		if(c[i]==c[j] &i!=j & !al.contains(c[i]))
	    		{
	    			k++;
	    		}
	    		else if(j==c.length-1 & !al.contains(c[i]))
	    		{
	    			System.out.print(c[i]);
	    			System.out.print(k);
	    			 al.add(c[i]);
	                                    k=1;
	    		}
	    		
	    	}
	    
	    }
	}
}

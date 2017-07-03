import java.util.*;
public class wordsReverse 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
		int c1=0;
		String b[]=str.split(" ");
		int c=b.length;
		for(int i=0;i<c;i++)
                {
			char a[]=b[i].toCharArray();
			c1=a.length;
			for(int j=c1-1;j>=0;j--)
                        {
				System.out.print(a[j]);
			}
			System.out.print(" ");
		}

    }
    
}

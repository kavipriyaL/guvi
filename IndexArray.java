import java.util.*;
public class IndexArray
{
    public static void Indexs(int b[])
    {
        Arrays.sort(b);
        for(int i=0;i<b.length;i++)
        {
            if(i==b[i])
            {
                System.out.print(b[i]+" ");
            }
        }
    } 
    public static void main(String args[])
   {
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int c[]=new int[n];
         for(int i=0;i<n;i++)
         {
             c[i]=in.nextInt();
         }
         Indexs(c);
    }
}

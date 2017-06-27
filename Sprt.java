import java.util.*;
public class Sprt
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int s1=0,s2=0;
        int n1=n/2;
        for(int i=0;i<n1;i++)
        {
            s1=s1+a[i];
        }
        int a2=s1/n1;
        for(int i=n1;i<a.length;i++)
        {
            s2=s2+a[i];
        }
        int k=a.length-n1;
        int a1=s2/k;
        System.out.print("[");
        if(a1==a2)
        {
            for(int i=0;i<n1;i++)
            {
              System.out.print(a[i]+" ");
            }
           System.out.print("]");
           System.out.print("[");
           for(int i=n1;i<a.length;i++)
           {
               System.out.print(a[i]+" ");
           }
           System.out.println("]");
        }
        else
        {
            System.out.println("Not possible");
        }
        
    }
}

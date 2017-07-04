import java.util.*;
public class Target
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int target=in.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
          for(int j=1;j<n;j++)  
          {
              int s=a[i]+a[j];
              if(s==target)
              {
                  System.out.println(a[i]+" "+a[j]);
              }
          }
        }
    }
    
}

import java.util.*;
public class CountCharacter 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char a[]=s.toCharArray();
        int c=0;
        for(int i=0;i<a.length;i++)
        {
          if(a[i]>='a' && a[i]<='z')
          {
              c++;
          }
        }
        System.out.println(c);
    }
}

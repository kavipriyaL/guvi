import java.util.*;
public class Player202 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        ArrayList con=new ArrayList();
        char c;
        int n=s.length();
        char cc[]=new char[n];
        String ss="";
        for(int i=0;i<n;i++)
        {
            c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
           {
                System.out.print(c);
            }
            else
            {
                ss=ss+c;
            }
        }
        System.out.print(ss);
    }
    
}

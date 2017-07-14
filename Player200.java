import java.util.*;
public class Player200 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String input1=in.next();
        String input2=in.next();
        String s=input1.substring(input1.length()-1,input1.length());
        
        int a=Integer.parseInt(input2);
        System.out.println(a);
        String first=input1.substring(0,1).toLowerCase();
        char c=input2.charAt(0);
        int n=10,r,ss=0,s1=0;
        while(n>9)
        {
            n=0;
            r=0;
            while(a!=0)
            {
              r=a%10;
              s1=r+s1;
              a=a/10;
              System.out.println(s1);
            }
            System.out.println(s1);
            ss=s1;
            a=s1;
            s1=0;
            n=a;
        }
        System.out.print(c);
        System.out.print(first);
        System.out.print(n);
        System.out.print(s);
    }
    
}

import java.util.*;
public class Player181
{
    public static void recursivefun(int n,int l) 
    { 
        if(n <= l) 
        {
            System.out.println(n); 
            recursivefun(n+1,l); 
        }
    }
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        recursivefun(1,n); 
    }
}

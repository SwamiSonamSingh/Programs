import java.util.*;
public class Set
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        int res=1;
        for(int i=0;i<exp;i++)
        {
            res=res*base;
        }
        System.out.println(res);
    }
}

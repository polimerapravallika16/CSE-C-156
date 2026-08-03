import java.util.*;
class seq
{
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int m=o.nextInt();
        int c=1,max=0,s=0;
        if(n>m)
        {
            int te=n;
            n=m;
            m=te;
            s=1;
        }
        for(int i=n;i<=m;i++)
        {
            int t=i;
            while(t!=1)
            {
                if(t%2!=0)
                {
                    t=t*3+1;
                    c++;
                }
                else if(t%2==0)
                {
                    t=t/2;
                    c++;
                }
            }
            max=Math.max(c,max);
            c=1;
        }
        if(s==1)
            System.out.println(m+" "+n+" "+max);
        else
            System.out.println(n+" "+m+" "+max);
        
    }
}

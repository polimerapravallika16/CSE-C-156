import java.util.*;
import java.io.*;
class division
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int sign=1;
        
        float x=obj.nextFloat();
        float y=obj.nextFloat();
        
        if(x<0&&y>0 || x>0&&y<0)
        sign=-1;
        x=Math.abs(x);
        y=Math.abs(y);
        float l=0,r=x;
        float mid=0;
        while(r-l>0.000001)
        {
            mid=(float)(l+r)/2;
            if(x<(y*mid))
            r=mid;
            else
            l=mid;
            
        }
        System.out.printf("%.5f",sign*mid);
    }
}

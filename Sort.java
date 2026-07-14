import java.io.*;
import java.util.*;

class Sort
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int max = Integer.MIN_VALUE;

        int[] a = new int[n];

        for (int i = 0; i < n; i++)
        {
            a[i] = obj.nextInt();

            if (a[i] > max)
                max = a[i];
        }

        int[] c = new int[max + 1];

       
        for (int i = 0; i < n; i++)
            c[a[i]]++;

      
        for (int i = 1; i < c.length; i++)
            c[i] = c[i] + c[i - 1];

        int[] b = new int[n];

      
        for (int i = n - 1; i >= 0; i--)
            b[--c[a[i]]] = a[i];

       
        for (int i = 0; i < n; i++)
            a[i] = b[i];

       
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}

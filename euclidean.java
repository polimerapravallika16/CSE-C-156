import java.util.Scanner;

public class euclidean{

static long x, y, gcd;

static void GCD(long a, long b) {
if (b == 0) {
 gcd = a;
 x = 1;
y = 0;
return;
 }

 GCD(b, a % b);
long temp = x;
 x = y;
 y = temp - (a / b) * y;
 }
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
 long a = sc.nextLong();
 long b = sc.nextLong();
 GCD(a, b);
 System.out.println(x + " " + y + " " + gcd);
                                                                                                                                                                                      sc.close();
    }
}

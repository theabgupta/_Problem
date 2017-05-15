import java.util.*;
import java.math.*;
class easy
{
public static void main(String args[])
{
try
{
Scanner sc= new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
int n=sc.nextInt();
int k=sc.nextInt();
int a[]= new int[k];
for(int j=0;j<k;j++)
a[j]=sc.nextInt();
int max=1;
for(int j=0;j<k;j++)
{
if(max<a[j])
max=a[j];
}
BigInteger fact = BigInteger.ONE;
for(int j=n;j>0;j--)
fact=fact.multiply(BigInteger.valueOf(j));
BigInteger result = BigInteger.ONE;
result=fact.mod(BigInteger.valueOf(max));
System.out.println(result);
}
}
catch(Exception e)
{
}
}
} 

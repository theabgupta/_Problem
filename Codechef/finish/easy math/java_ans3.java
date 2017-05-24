import java.io.*;
class Q1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int i,t,n,k;
		t=Integer.parseInt(in.readLine());
		while(t-->0)
		{
			long max=0,fact=1;
			String s[]=in.readLine().split(" ");
			n=Integer.parseInt(s[0]);
			k=Integer.parseInt(s[1]);
			String s1[]=in.readLine().split(" ");
			for(i=0;i<k;i++)
			if(Long.parseLong(s1[i])>max)
			max=Long.parseLong(s1[i]);
			for(i=2;i<=n;i++)
			fact=((fact%max)*(i%max))%max;
			System.out.println(fact);
		}
	}
}
 

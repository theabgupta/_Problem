/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n =0;int[] a = null;int res=0;
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		for(int i =0;i<tc;i++){
		    n  = in.nextInt();
		    a = new int[n];
		    for(int j =0;j<n;j++){
		        a[j] = in.nextInt();
		    }
		    for(int j =0;j<n;j++){
		        if(res<a[j]){
		            res = a[j];
		        }
		    }
		    res = n-res;
		    System.out.println(res);
		}
	}
} 
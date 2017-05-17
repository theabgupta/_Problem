/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()){
		
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = in.nextInt();
		
			int[][] val = new int[n][n];
		
			int[][] dp = new int[n][n];
		
			createVal(val, arr);
		
			int res = solution(val,dp,0,n-1);
		
			System.out.println(res);
		}

	}

	public static int solution(int[][] val,int[][] dp,int start, int end){
		if(start == end)
			return 0;
		
		if(dp[start][end] != 0)
			return dp[start][end];
		
		int res = Integer.MAX_VALUE;
		
		for(int i=start;i<end;i++){
			res = Math.min(res, solution(val,dp,start,i)+solution(val,dp,i+1,end)+val[start][i]*val[i+1][end]);
		}
		
		return dp[start][end] = res;
	}
	
	
	public static void createVal(int[][] val, int[] arr){
		
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				val[i][j] = 0;
				if(i == j){
					val[i][j] = arr[i];
				}
				else{
					int sum = 0;
					for(int k=i;k<=j;k++){
						sum = sum + arr[k];
					}
					val[i][j] = sum%100;
				}
			}
		}
	}
 
}
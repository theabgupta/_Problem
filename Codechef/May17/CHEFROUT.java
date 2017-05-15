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
		int tc = in.nextInt();
		for(int i=0;i<tc;i++){
		    String st = in.next();
		    char[] arr = st.trim().toCharArray();
		    char temp = arr[0];
		    String msg = "yes";
		    for(int j =0;j<arr.length-1;j++){
		        if(temp == arr[j+1]){
		            continue;
		        }else if(temp == 'E' && arr[j+1] == 'C'){
		            msg = "no";break;
		        }else if(temp == 'S' && (arr[j+1]=='C' || arr[j+1]=='E')){
		            msg="no";break;
		        }else{
		            temp = arr[j];
		        }
		    }
		    System.out.println(msg);
		}
	}
}
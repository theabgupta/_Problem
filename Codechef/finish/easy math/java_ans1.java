import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
 
public class Main {
 
	static BufferedReader read = new BufferedReader(new InputStreamReader(
			System.in));
	static BufferedWriter write = new BufferedWriter(new OutputStreamWriter(
			System.out));
 
	 static BigInteger[] facts = new BigInteger[101];
	public static void main(String[] args) throws IOException {
		
		
		init();
		int test= strToInt(read.readLine());
		
		
		for(int i =0;i<test;i++)
		{
			String[] s = read.readLine().split(" ");
			int n = strToInt(s[0]);
			
			 int max = maxi(read.readLine().split(" "));
			 write.write(facts[n].mod(new BigInteger(max+""))+"\n");
		}
		
		write.flush();
	}


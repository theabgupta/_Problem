 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
 class Test {
      
 
 
     public static  void main(String[]args) throws IOException {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  
        int test = Integer.valueOf(br.readLine());
        
        while(test!=0){
        String input = br.readLine();
        String tokens[] = input.split(" ");
        int N = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);
        
        String arrayele = br.readLine();
        String t[] = arrayele.split(" ");
         int  arr[] = new int[k];
         int max = Integer.MIN_VALUE;
         for(int i=0;i<k;++i){
             arr[i] = Integer.parseInt(t[i]);
             max = Math.max(max, arr[i]);
         }
         long answer =1;
         for(int i=1;i<=N;++i){
             answer = (answer*i)%max;
             answer = answer%max;
         }
            System.out.println(answer%max);
 
        --test;
        }
     }
} 

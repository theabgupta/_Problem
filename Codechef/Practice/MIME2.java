import java.util.*;
import java.lang.*;
import java.io.*;
 
 class Codechef {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        int index =0;
        String temp = null;
        String type[][] = new String[N][2];
        String file[] = new String[Q];
        for(int i =0 ; i<N;i++){
            type[i][0] = in.next();
            type[i][1] = in.next();
        }
        for(int i =0 ; i<Q;i++){
            file[i] = in.next();
            index = file[i].lastIndexOf('.');
            if(index == -1){
                System.out.println("unknown");
            }else{
                int flag = -1;
                file[i] = file[i].substring(index+1); 
                for(int j=0;j<N;j++){
                    
                    if(file[i].equals(type[j][0])){
                        flag = j;
                        break;
                    }
                }
                if(flag!= -1){
                    System.out.println(type[flag][1]);
                }else{
                    System.out.println("unknown");
                }
                
            }
        }
    }   
} 
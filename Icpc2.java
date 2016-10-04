
package icpc2;

import java.util.*;
import java.io.*;


public class Icpc2 {

    
    public static void main(String[] args) {
        
    	 Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
    for(int k=1;k<=t;k++){
        
        int n=sc.nextInt();
        String p=sc.next();
        int[][] T=new int[n+1][n+1];
        
        
        
       // System.out.println(p);
          for(int i=0; i<=n; i++) { T[i][0] = i; }
        for(int i=0; i<=n; i++) { T[0][i] = i; }
 
       
     
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
            
          //      System.out.println(i+" "+p.charAt(i-1)+" "+" "+j+" "+ p.charAt(j-1));
                if (p.charAt(i-1) == p.charAt(n-j))
                    T[i][j] = T[i-1][j-1];
                else
                    T[i][j] = Math.min(T[i-1][j], T[i][j-1])+1;
            }
        }
       for(int i=0; i<=n; i++) {
            for(int j=0; j<=n; j++) {
                System.out.print(T[i][j]+" ");
            
            }
            System.out.println();
       }
       System.out.println(T[n][n]/2); 
    }
    }
    
}


package main;
import java.util.*;
import java.io.*;

public class Main {
     int count=0;
     void test(int i,int j,int[] a){

         if(a[i]>a[j]) count++;
         else return;
    }
 void check(int[] a){
     
    for(int i=0;i<a.length-3;i+=2){
       for(int j=i+2;j<a.length-1;j+=2){
           if(a[i]<a[j]){
               test(i+1,j+1,a);
           }
           else if(a[i]>a[j]){
               test(j+1,i+1,a);
           }
       }
        
       
    }
    
}
    
    public static void main(String[] args) throws IOException {
            Scanner sc=new Scanner(new FileReader("F:\\a.in"));
            PrintWriter pw=new PrintWriter(new FileWriter("F:\\out.txt"));
            Main obj=new Main();        
            int t=sc.nextInt();
            int n;
            int i=0;
            int[] a;
            int pop=1;
            while(t>0){
                n=sc.nextInt();
                a=new int[2*n];
                while(n>0){
                    a[i]=sc.nextInt();
                    i++;
                    a[i]=sc.nextInt();
                    i++;
                    n--;
                }
                
                obj.check(a);
                pw.println("Case #"+pop+": "+obj.count);
                pw.flush();
                obj.count=0;
                pop++;
                i=0;
                t--;
            }
            
        pw.close();
        sc.close();
    }
    
}


package lcs;

import java.util.*;

public class Lcs {

     int lcs(String s1,String s2,int m,int n){
        if(m==0 || n==0) return 0;
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+lcs(s1,s2,m-1,n-1);
        }
        else
            return Math.max(lcs(s1,s2,m,n-1), lcs(s1,s2,m-1,n));
        
    }
     void lcs2(String s1,String s2,int m,int n){
         int[][] l=new int[m+1][n+1];
        
         for(int i=0;i<=m;i++){
             for(int j=0;j<=n;j++){
                 if(i==0 || j==0){
                     l[i][j]=0;
                 }
                 else if(s1.charAt(i-1)==s2.charAt(j-1)){
                     l[i][j]=l[i-1][j-1]+1;
                 }
                 else{
                     l[i][j] = Math.max(l[i-1][j], l[i][j-1]);
                 }
             }
         }
         
         
         int index=l[m][n];
         int a=m,b=n;
         String st="";
         while(a>0 && b>0){
             if(s1.charAt(a-1)==s2.charAt(b-1)){
                 String sz=String.valueOf(s1.charAt(a-1));
                 
                   st=st+sz;
                   a--;b--;
             }
             else if(l[a-1][b]>l[a][b-1]){
                 a--;
             }else{
                 b--;
             }
         }
         for(int p=st.length()-1;p>=0;p--)
         System.out.print(st.charAt(p));
     }
     
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Lcs obj=new Lcs();
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    
    int m=s1.length();
    int n=s2.length();
    System.out.println(obj.lcs(s1,s2,m,n)+" ");
    obj.lcs2(s1, s2, m, n);
        
        
    }
    
}

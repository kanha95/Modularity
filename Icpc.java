
import java.util.*;
import java.util.regex.Pattern;


public class Icpc {
static int[] dp=new int[10];

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
       String s1=sc.next();
       String sub=sc.next();
       int m=s1.length();
       int n=sub.length();
       int[][] ar=new int[s1.length()+1][sub.length()+1];
       
      for(int j=1;j<=n;j++){
          ar[0][j]=0;
      }
      for(int i=0;i<=m;i++){
          ar[i][0]=1;
      }
      for(int i=1;i<=m;i++){
          for(int j=1;j<=n;j++){
              String x=sub.substring(n-j);
              String y=s1.substring(m-i);
            //  System.out.println(x+" p "+y);
              if(x.charAt(0)==y.charAt(0)){
               // System.out.println("www");
                  ar[i][j]=ar[i-1][j]+ar[i-1][j-1];
              }else{
                  ar[i][j]=ar[i-1][j];
              }
          }
      }
   /*    for(int i=0;i<=m;i++){
          for(int j=0;j<=n;j++){
       System.out.print(ar[i][j]+" ");
          }
          System.out.println();
       }
      */
       System.out.println(ar[m][n]);
       }
       
       
    }
    


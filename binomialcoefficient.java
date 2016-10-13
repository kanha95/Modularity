
import java.util.Arrays;


public class Learndp {
   
    static int[][] dp;
    
//    static int[][] d={{0,1},{1,0},{1,1}};
   
 static int check(int n,int r){
       if(dp[n][r]!=-1){
         return dp[n][r];
     }
       else if(r==n || r==0){
         dp[n][r]= 1;
         //return dp[n][r];
     }
    
     else{
     dp[n][r]= check(n-1,r-1)+check(n-1,r);  
     }
     System.out.println(n+" "+r);
     return dp[n][r];
 }
    public static void main(String[] args) {
    
    int n=5;
    int r=2;
    dp=new int[n+1][r+1];
    for(int[] x:dp)
    Arrays.fill(x,-1);
    System.out.println(check(n,r));
    }  
    
}

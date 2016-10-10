
import java.util.Arrays;


public class Learndp {
   
    static int[][] dp;
    static int[][] d={{0,1},{1,0},{1,1}};
   
   // static int check(int[][] ar,int m,int n){
    //}
    public static void main(String[] args) {
       int[][] ar={{7,2,3},{4,8,2},{1,5,3}};
       dp=new int[4][4];
  
       for(int i=0;i<=3;i++){
           for(int j=0;j<=3;j++){
             if(i==0 && j!=0){
                 dp[0][j]=Integer.MAX_VALUE;
             }else if(i==0 && j==0){
                 dp[i][j]=0;
             }
             else if(j==0){
                 dp[i][0]=Integer.MAX_VALUE;
             }
             else{
                 dp[i][j]=ar[i-1][j-1]+Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]);
             }
           }
       }
       
       for(int i=0;i<=3;i++){
           for(int j=0;j<=3;j++){
      System.out.print(dp[i][j]+" ");
           }
           System.out.println();
       }
    }
    
}

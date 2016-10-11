
import java.util.Arrays;


public class Learndp {
   
    static int[][] dp;
    
//    static int[][] d={{0,1},{1,0},{1,1}};
   
 
    public static void main(String[] args) {
    
    int n=4;
    int[] ar={1,2,3};
  dp=new int[n+1][4];
  
   for(int i=0;i<=n;i++){
      for(int j=0;j<4;j++){
       if(i==0) dp[0][j]=1;
       if(i!=0 && j==0) dp[i][0]=0;
      }
      }
  
  for(int i=0;i<=n;i++){
      for(int j=1;j<4;j++){
          int x=0,y=0;
        //considering ar[j-1]
           if(i-ar[j-1]>=0){
               x=dp[i-ar[j-1]][j];
            
          }   
           //not considering ar[j-1]
                   y=dp[i][j-1]; 
     
              dp[i][j]=x+y;
          }
      }
  for(int i=0;i<=4;i++){
      for(int j=0;j<=3;j++){
          System.out.print(dp[i][j]+" ");
      }System.out.println();
  }
   System.out.println(dp[n][3]);
    }  
    
}

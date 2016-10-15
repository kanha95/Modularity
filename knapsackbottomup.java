
import java.util.Arrays;


public class Learndp {
   
    static int[][] dp;
    
//    static int[][] d={{0,1},{1,0},{1,1}};
 
    public static void main(String[] args) {
    int wt[]={10,20,30};
    int[] val=new int[]{60,100,120};
   
    int w=50;
    dp=new int[4][51];
    
    for(int i=0;i<=3;i++){
        for(int j=0;j<=w;j++){
            if(j==0 || i==0){
                dp[i][j]=0;
            }
            else if(wt[i-1]>j){
                dp[i][j]=dp[i-1][j];
            }else{
                dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
            }
        }
    }
    for(int i=0;i<=3;i++){
        for(int j=0;j<=w;j++){
        System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
        
    
    }  
    
}

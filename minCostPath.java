
import java.util.Arrays;


public class Learndp {
   
    static int[][] dp;
    static int[][] d={{0,1},{1,0},{1,1}};
   
    static int check(int[][] ar,int m,int n){
        if(m==2 && n==2){
            dp[m][n]= ar[m][n];
        }
        else
        if(m>2 ||n>2){
            dp[m][n]= Integer.MAX_VALUE;
        }
        else{
          
            dp[m][n]= ar[m][n]+Math.min(Math.min(check(ar,m+1,n), 
                    check(ar,m,n+1)),check(ar,m+1,n+1));
        }
        return dp[m][n];
    }
    
    public static void main(String[] args) {
       int[][] ar={{1,2,3},{4,8,2},{1,5,3}};
       dp=new int[4][4];
       System.out.println(check(ar,0,0));
      
    }
    
}

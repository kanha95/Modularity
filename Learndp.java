
import java.util.Arrays;


public class Learndp {
   
    static int[][] dp;
    static int check(String s1,String s2,int m,int n){
       if(m==0) return n;
       if(n==0) return m;
       
       if(s1.charAt(m-1)==s2.charAt(n-1)){
           dp[m][n]=check(s1,s2,m-1,n-1);
       }else{
           dp[m][n]= 1+Math.min(Math.min(check(s1,s2,m,n-1), 
                   check(s1,s2,m-1,n)), check(s1,s2,m-1,n-1));
       }
       return dp[m][n];
    } 
    public static void main(String[] args) {
       String s1="satun";
       String s2="sun";
       dp=new int[s1.length()+1][s2.length()+1];
     //  dp[s1.length()][s2.length()]=0;
       System.out.println(check(s1,s2,s1.length(),s2.length()));
       // System.out.println(dp[0][0]);
    }
    
}


import java.util.Arrays;


public class Learndp {
   
    static int[] dp;
    
//    static int[][] d={{0,1},{1,0},{1,1}};
   
   int check(int[] a,int n,int l){
       dp[l]=0;
      if(n==0){
          
          dp[l]=dp[l]+ 1;
      }
      else if(n<0){
          dp[l]= 0;
      }
      else if(n>0 && l<=0){
          dp[l]= 0;
      }
      else {
         dp[l]+= check(a,n-a[l-1],l)+check(a,n,l-1);
       
      }
      return dp[l];
  }
    public static void main(String[] args) {
    
    int n=4;
    int[] ar={1,2,3};
   
    dp=new int[6];
 
        System.out.println(new Learndp().check(ar,n,3));
        
    for(int i=0;i<=4;i++){
           
      System.out.print(dp[i]+" ");
           }
     
   // System.out.println(count);
    }  
    
}

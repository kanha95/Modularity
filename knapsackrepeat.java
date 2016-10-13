
import java.util.Arrays;


public class Learndp {
   
    static int[][] dp;
    
//    static int[][] d={{0,1},{1,0},{1,1}};
   
 static int check(int w,int[] wt,int[] val,int n){
   if(w==0 || n==0){
       return 0;
   }
   if(wt[n-1]>w){
       return check(w,wt,val,n-1);
   }else{
       return Math.max(val[n-1]+check(w-wt[n-1],wt,val,n-1),
               Math.max(val[n-1]+check(w-wt[n-1],wt,val,n),check(w,wt,val,n-1)));
               //just remove 2nd term of above statement to get knapsack without repeatetion
   }
 }
    public static void main(String[] args) {
    int wt[]={10,20,30};
    int[] val=new int[]{60,100,120};
    int w=50;
    System.out.println(check(w,wt,val,3));
        
        
    
    }  
    
}

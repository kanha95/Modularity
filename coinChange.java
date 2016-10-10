
import java.util.Arrays;


public class Learndp {
   
    static int[][] dp;
     int count=0;
//    static int[][] d={{0,1},{1,0},{1,1}};
   
   int check(int[] a,int n,int l){
       count=0;
      if(n==0){
          
          return 1;
      }
      else if(n<0){
          return 0;
      }
      else if(n>0 && l<=0){
          return 0;
      }
      else {
         count=count+ check(a,n-a[l-1],l)+check(a,n,l-1);
         return count;
      }
    
  }
    public static void main(String[] args) {
    
    int n=4;
    int[] ar={1,2,3};
   
    
        System.out.println(new Learndp().check(ar,n,3));
        
    
   // System.out.println(count);
    }  
    
}

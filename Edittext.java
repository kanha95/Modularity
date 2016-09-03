
package edittext;


public class Edittext {

   int check(String s1,String s2,int m,int n){
       if(m==0) return n;
       else if(n==0) return m;
       else if(s1.charAt(m-1)==s2.charAt(n-1)){
           return check(s1,s2,m-1,n-1);     
       }else{
           return 1+Math.min(Math.min(check(s1,s2,m,n-1), check(s1,s2,m-1,n)), check(s1,s2,m-1,n-1));
       }
       
   }
   int dcheck(String s1,String s2,int m,int n){
       int[][] d=new int[m+1][n+1];
       for(int i=0;i<=m;i++){
           for(int j=0;j<=n;j++){
            if(i==0) d[i][j]=j;
            else if(j==0) d[i][j]=i;
            else if(s1.charAt(i-1)==s2.charAt(j-1)){
                d[i][j]=d[i-1][j-1];
            }else{
                d[i][j]=1+Math.min(Math.min(d[i][j-1],d[i-1][j]),d[i-1][j-1]);
            }
           }
       }
       return d[m][n];
   }
    public static void main(String[] args) {
       String s1="sun";
       String s2="sunsun";
      int m=s1.length();
      int n=s2.length();
      System.out.println(new Edittext().check(s1,s2,m,n));
    }
    
}
